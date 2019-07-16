package com.lzw.wind.tibmas.oauth.server.web.controller;

import com.google.code.kaptcha.Producer;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tibmas.core.dto.AppDTO;
import com.hyzs.tibmas.core.dto.ListAppByUserAccountDTO;
import com.hyzs.tibmas.core.service.AppService;
import com.hyzs.tibmas.core.service.UserService;
import com.hyzs.tibmas.core.util.CreateQRcode;
import com.hyzs.tibmas.core.vo.ClientVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.List;

/**
 * @author liys
 * @date 2018/6/2615:06
 */
@RestController
public class LoginUserInfoController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private AppService appService;

    @Autowired
    private Producer producer;

    private static final String OAUTH2_CAPTCHA_KEY = "OAUTH2_CAPTCHA_KEY";

    @RequestMapping(value = {"/webapi/oauth2Server/loginUserInfo","/webapi/loginUserInfo"}, method = RequestMethod.POST)
    public ResponseVO<Principal> loginUserInfo(Principal principal) {
        return CommonUtils.okResponseVO(principal);
    }

    @ApiOperation("根据用户账号得到用户所能访问的应用列表")
    @RequestMapping(value = {"/webapi/oauth2Server/listAppByUserAccount","/webapi/listAppByUserAccount"}, method = RequestMethod.POST)
    public ResponseVO<List<AppDTO>> listAppByUserAccount(@RequestBody ListAppByUserAccountDTO dto) {
        if (dto == null) {
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "用户名不能为空。");
        }
        List<AppDTO> appDTOList = userService.listAppByUserAccount(dto);
        return CommonUtils.okResponseVO(appDTOList);

    }

    @RequestMapping(value = {"/webapi/oauth2Server/getClient","/webapi/getClient"}, method = RequestMethod.POST)
    @ApiOperation("得到应用信息")
    public ResponseVO<ClientVO> test(HttpSession session) {
        String clientId = null;

        SavedRequest savedRequest = ((SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST"));
        if (savedRequest != null && savedRequest.getParameterMap() != null && savedRequest.getParameterMap().get("client_id") != null) {
            String[] clientIds = savedRequest.getParameterMap().get("client_id");
            if (clientIds.length >= 1) {
                clientId = clientIds[0];
            }
        }

        return CommonUtils.okResponseVO(appService.getClient(clientId));

    }

    @ApiOperation("得到登录二维码")
    @RequestMapping(value = {"/webapi/oauth2Server/getQRcode","/webapi/getQRcode"}, method = RequestMethod.GET)
    public void getQRcode(HttpServletResponse response, @RequestParam("id") String id) {
        String text = id;
        int width = 200;
        int height = 200;
        String format = "jpg";
        try {
            CreateQRcode.addImageQRcode(text, width, height, format, response);
        } catch (Exception e) {
            PrintWriter toClient = null; //得到向客户端输出文本的对象
            try {
                toClient = response.getWriter();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            response.setContentType("text/html;charset=UTF-8");
            toClient.write("无法打开图片!");
            toClient.close();
        }
    }


    @RequestMapping(value = {"/webapi/oauth2Server/createCaptcha","/webapi/createCaptcha"}, method = RequestMethod.POST)
    @ApiOperation("自动登录验证码")
    public ResponseVO<String> createOutCaptcha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String content = this.createCaptchaForBase64(request, response, OAUTH2_CAPTCHA_KEY);
        return CommonUtils.okResponseVO(content);
    }

    /**
     * 生成验证码，返回base64的字符串.
     *
     * @param request
     * @param response
     * @param key
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private String createCaptchaForBase64(HttpServletRequest request, HttpServletResponse response, String key) throws ServletException, IOException {
        //生成文字验证码
        String text = producer.createText();

        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到http session
        request.getSession().setAttribute(key, text);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", out);

        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();

        return encoder.encode(out.toByteArray());
    }

}
