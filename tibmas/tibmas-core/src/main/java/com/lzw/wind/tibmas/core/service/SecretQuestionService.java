package com.lzw.wind.tibmas.core.service;

import com.hyzs.tibmas.core.dbo.AddSecretQuestionDTO;
import com.hyzs.tibmas.core.dto.ListSecretQuestionDTO;
import com.hyzs.tibmas.core.dto.SecretQuestionDTO;
import com.hyzs.tibmas.core.dto.ValidateSecretQuestionDTO;
import com.hyzs.tibmas.core.vo.SecretQuestionVO;
import com.hyzs.tibmas.core.vo.UserSecretQuestionVO;

import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/29 10:39
 */
public interface SecretQuestionService {

    /**
     * 保存用户密保问题
     */
    Integer addUserSecretQuestions(SecretQuestionDTO dto);

    /**
     * 修改用户密保问题
     */
    Integer updateUserSecretQuestions(SecretQuestionDTO dto);

    /**
     * 根据用户id查询用户密保问题列表
     */
    List<UserSecretQuestionVO> listUserSecretQuestions(ListSecretQuestionDTO dto);

    /**
     * 验证密保问题
     */
    String validateSecretQuestions(ValidateSecretQuestionDTO dto);

    /**
     * 新增密保问题接口
     * @param dto
     * @return
     */
    Integer addSecretQuestion(AddSecretQuestionDTO dto);

    /**
     * 查询密保问题列表（可做下拉）
     * @return
     */
    List<SecretQuestionVO> listSecretQuestion();

}
