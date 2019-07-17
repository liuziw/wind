package com.lzw.wind.tibmas.oauth.bo;


import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import lombok.Data;

import java.util.List;


/**
 * check_token接口返回的数据格式
 */
@Data
public class CheckTokenUserInfoBO {

    private CheckTokenAreaBO areaInfo;

    private CheckTokenAppBO appInfo;

    private CheckTokenDeptBO deptInfo;

    private CheckTokenUserBO userDO;

    private List<CheckTokenRoleBO> roleInfoList;

    private List<CheckTokenPermBO> permInfoList;

    private List<PermTreeVO> permTreeVOS;


    private List<CheckTokenTermBO> teamInfoList;
}
