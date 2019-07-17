package com.lzw.wind.tibmas.core.service.impl;

import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.wind.tibmas.core.bo.ValidateSecretQuestionBO;
import com.lzw.wind.tibmas.core.daomanager.SecretQuestionDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserSecretQuestionDaoManager;
import com.lzw.wind.tibmas.core.dbo.AddSecretQuestionDTO;
import com.lzw.wind.tibmas.core.dbo.SecretQuestionDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.dbo.UserSecretQuestionDO;
import com.lzw.wind.tibmas.core.dto.ListSecretQuestionDTO;
import com.lzw.wind.tibmas.core.dto.SecretQuestionDTO;
import com.lzw.wind.tibmas.core.dto.ValidateSecretQuestionDTO;
import com.lzw.wind.tibmas.core.service.SecretQuestionService;
import com.lzw.wind.tibmas.core.util.EncryptUtils;
import com.lzw.wind.tibmas.core.util.PassWordUtils;
import com.lzw.wind.tibmas.core.vo.SecretQuestionVO;
import com.lzw.wind.tibmas.core.vo.UserSecretQuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/29 10:41
 */
@Service
public class SecretQuestionServiceImpl implements SecretQuestionService {

    @Autowired
    private SecretQuestionDaoManager secretQuestionDaoManager;

    @Autowired
    private UserSecretQuestionDaoManager userSecretQuestionDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    /**
     * 保存用户密保问题
     * <pre>
     *     1.将问题答案加密
     *     2.转换do插入数据库
     * </pre>
     * @param dto
     * @return
     */
    @Override
    @Transactional
    public Integer addUserSecretQuestions(SecretQuestionDTO dto){
        List<UserSecretQuestionDO> userSecretQuestionDOList = checkSecretQuestion(dto);

        return userSecretQuestionDaoManager.insertAllPropertiesList(userSecretQuestionDOList);
    }

    /**
     * 修改用户密保问题
     * <pre>
     *     1.根据userID删除原有密保问题
     *     2.新增密保问题
     * </pre>
     * @param dto
     * @return
     */
    @Override
    @Transactional
    public Integer updateUserSecretQuestions(SecretQuestionDTO dto){
        List<UserSecretQuestionDO> userSecretQuestionDOList = checkSecretQuestion(dto);
        userSecretQuestionDaoManager.deleteByUserAccount(dto.getUserAccount());

        return  userSecretQuestionDaoManager.insertAllPropertiesList(userSecretQuestionDOList);
    }

    /**
     * 根据用户id查询用户密保问题列表
     * @param dto
     * @return
     */
    @Override
    public List<UserSecretQuestionVO> listUserSecretQuestions(ListSecretQuestionDTO dto){
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"用户账号不能为空");
        }
        //判断该用户是否存在
        Integer count = userDaoManager.countByUserAccount(dto.getUserAccount());
        if(count == null || count==0){
            throw CommonException.exception(CommonErrorCode.USER_NOT_FOUND,"该用户不存在");
        }
        List<UserSecretQuestionDO> userSecretQuestionDOList = userSecretQuestionDaoManager.listByUserAccount(dto.getUserAccount());
        if(CollectionUtils.isEmpty(userSecretQuestionDOList)){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"您还没有设置密保问题，请联系管理员重置密码");
        }
        List<UserSecretQuestionVO> secretQuestionsVOList = new ArrayList<>();
        List<Long> questionIds = userSecretQuestionDOList.stream().map(UserSecretQuestionDO::getQuestionId).collect(toList());
        Map<Long,SecretQuestionDO> secretQuestionDOMap = secretQuestionDaoManager.mapByIds(questionIds);
        if(!CollectionUtils.isEmpty(secretQuestionDOMap)){
            for (UserSecretQuestionDO userSecretQuestionDO:userSecretQuestionDOList){
                UserSecretQuestionVO secretQuestionVO = CommonUtils.newInstance(userSecretQuestionDO,UserSecretQuestionVO.class);
                secretQuestionVO.setQuestionDesc(secretQuestionDOMap.get(secretQuestionVO.getQuestionId())==null?"":secretQuestionDOMap.get(secretQuestionVO.getQuestionId()).getQuestionDesc());
                secretQuestionsVOList.add(secretQuestionVO);
            }
        }

        return secretQuestionsVOList;
    }

    /**
     * 验证密保问题
     * <pre>
     *     1.根据问题id得到问题do,如果do==null,则抛出验证失败
     *     2.如果do的问题答案不等于bo答案,则抛出验证失败
     *     3.如果通过验证则生成随机8位密码，修改密码后返回给前端
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public String validateSecretQuestions(ValidateSecretQuestionDTO dto){
        if (dto == null || CollectionUtils.isEmpty(dto.getValidateSecretQuestionBOList())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"密保问题验证失败");
        }
        List<ValidateSecretQuestionBO> validateSecretQuestionBOList = dto.getValidateSecretQuestionBOList();
        List<Long> userSecretQuestionIds = validateSecretQuestionBOList.stream().map(ValidateSecretQuestionBO::getId).collect(toList());
        Map<Long,UserSecretQuestionDO> userSecretQuestionDOMap = userSecretQuestionDaoManager.mapByIds(userSecretQuestionIds);
        if(CollectionUtils.isEmpty(userSecretQuestionDOMap)){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"密保问题验证失败");
        }
        for(ValidateSecretQuestionBO validateSecretQuestionBO : validateSecretQuestionBOList){
            UserSecretQuestionDO userSecretQuestionDO = userSecretQuestionDOMap.get(validateSecretQuestionBO.getId());
            if(userSecretQuestionDO == null){
                throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"密保问题验证失败");
            }
            if(!userSecretQuestionDO.getQuestionAnswer().equals(EncryptUtils.encryptBySha256(validateSecretQuestionBO.getQuestionAnswer()))){
                throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"密保问题验证失败");
            }
        }

        String newPassWord = PassWordUtils.getRandowPassWord();
        UserDO userDO = userDaoManager.singleResultByUserAccount(dto.getUserAccount());
        userDO.setUserPassword(EncryptUtils.encryptBySha256(EncryptUtils.encryptByMD5(newPassWord).toLowerCase()));
        userDO.setUpdatePasswordTime(new Date());
        userDaoManager.updateNotNullProperties(userDO);

        return newPassWord;
    }

    /**
     * 新增密保问题接口
     * @param dto
     * @return
     */
    public Integer addSecretQuestion(AddSecretQuestionDTO dto){
        if (dto == null || StringUtils.isEmpty(dto.getQuestionDesc())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"问题不能为空");
        }
        SecretQuestionDO secretQuestionDO = secretQuestionDaoManager.singleResultByQuestionDesc(dto.getQuestionDesc());
        if(secretQuestionDO != null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"改问题已经存在，请重新设置");
        }
        secretQuestionDO = CommonUtils.newInstance(dto,SecretQuestionDO.class);

        return secretQuestionDaoManager.insertNotNullProperties(secretQuestionDO);

    }

    /**
     * 查询密保问题列表（可做下拉）
     * @return
     */
    public List<SecretQuestionVO> listSecretQuestion(){
        List<SecretQuestionVO> secretQuestionVOList = new ArrayList<>();
        List<SecretQuestionDO> secretQuestionDOList = secretQuestionDaoManager.listAll();
        for (SecretQuestionDO secretQuestionDO:secretQuestionDOList){
            SecretQuestionVO secretQuestionVO = CommonUtils.newInstance(secretQuestionDO,SecretQuestionVO.class);
            secretQuestionVOList.add(secretQuestionVO);
        }

        return secretQuestionVOList;
    }

    private List<UserSecretQuestionDO> checkSecretQuestion(SecretQuestionDTO dto){
        if(dto == null || CollectionUtils.isEmpty(dto.getSecretQuestionsBOList()) || dto.getSecretQuestionsBOList().get(0) == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"密保问题不能为空");
        }
        List<UserSecretQuestionDO> userSecretQuestionDOList = dto.getSecretQuestionsBOList().stream().map(secretQuestionsBO ->{
            UserSecretQuestionDO userSecretQuestionDO = CommonUtils.newInstance(secretQuestionsBO,UserSecretQuestionDO.class);
            userSecretQuestionDO.setUserAccount(dto.getUserAccount());
            userSecretQuestionDO.setQuestionAnswer(EncryptUtils.encryptBySha256(userSecretQuestionDO.getQuestionAnswer()));
            return userSecretQuestionDO;
        }).collect(Collectors.toList());
        return userSecretQuestionDOList;
    }
}
