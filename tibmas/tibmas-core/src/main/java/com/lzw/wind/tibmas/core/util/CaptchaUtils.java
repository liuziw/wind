package com.lzw.wind.tibmas.core.util;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 验证码工具类
 * @author zhongsj
 * @date 2018/03/15
 */
public class CaptchaUtils {

    @Autowired
    private static Producer producer;

    /**
     * 生成验证码，返回base64的字符串.
     * @param request
     * @param response
     * @param key
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static String createCaptchaForBase64(HttpServletRequest request, HttpServletResponse response, String key) throws ServletException, IOException {
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到http session
        request.getSession().setAttribute(key, text);

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", out);

        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();

        return encoder.encode(out.toByteArray());
    }
}
