package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableOpenUserDaoManager;
import com.lzw.wind.tibmas.core.dbo.OpenUserDO;
import com.lzw.wind.tibmas.core.mapper.OpenUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableOpenUserDaoManagerImpl extends CommonDaoManagerImpl<OpenUserDO,Long> implements ImmutableOpenUserDaoManager {

        @Autowired
        private OpenUserMapper openUserMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(openUserMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(OpenUserDO.ID,OpenUserDO.DB_ID);
            fieldMap.put(OpenUserDO.DB_ID,OpenUserDO.DB_ID);

            fieldMap.put(OpenUserDO.OPEN_ID,OpenUserDO.DB_OPEN_ID);
            fieldMap.put(OpenUserDO.DB_OPEN_ID,OpenUserDO.DB_OPEN_ID);

            fieldMap.put(OpenUserDO.USER_ID,OpenUserDO.DB_USER_ID);
            fieldMap.put(OpenUserDO.DB_USER_ID,OpenUserDO.DB_USER_ID);

            fieldMap.put(OpenUserDO.EXAMINE_STATUS,OpenUserDO.DB_EXAMINE_STATUS);
            fieldMap.put(OpenUserDO.DB_EXAMINE_STATUS,OpenUserDO.DB_EXAMINE_STATUS);

            fieldMap.put(OpenUserDO.WX_HEAD_IMG,OpenUserDO.DB_WX_HEAD_IMG);
            fieldMap.put(OpenUserDO.DB_WX_HEAD_IMG,OpenUserDO.DB_WX_HEAD_IMG);

            fieldMap.put(OpenUserDO.NICK_NAME,OpenUserDO.DB_NICK_NAME);
            fieldMap.put(OpenUserDO.DB_NICK_NAME,OpenUserDO.DB_NICK_NAME);

            fieldMap.put(OpenUserDO.WX_PHONE_NUM,OpenUserDO.DB_WX_PHONE_NUM);
            fieldMap.put(OpenUserDO.DB_WX_PHONE_NUM,OpenUserDO.DB_WX_PHONE_NUM);

            fieldMap.put(OpenUserDO.WX_GENDER,OpenUserDO.DB_WX_GENDER);
            fieldMap.put(OpenUserDO.DB_WX_GENDER,OpenUserDO.DB_WX_GENDER);

            fieldMap.put(OpenUserDO.WX_APP_ID,OpenUserDO.DB_WX_APP_ID);
            fieldMap.put(OpenUserDO.DB_WX_APP_ID,OpenUserDO.DB_WX_APP_ID);

            fieldMap.put(OpenUserDO.UNION_ID,OpenUserDO.DB_UNION_ID);
            fieldMap.put(OpenUserDO.DB_UNION_ID,OpenUserDO.DB_UNION_ID);

            fieldMap.put(OpenUserDO.IS_DELETED,OpenUserDO.DB_IS_DELETED);
            fieldMap.put(OpenUserDO.DB_IS_DELETED,OpenUserDO.DB_IS_DELETED);

            fieldMap.put(OpenUserDO.GMT_CREATE,OpenUserDO.DB_GMT_CREATE);
            fieldMap.put(OpenUserDO.DB_GMT_CREATE,OpenUserDO.DB_GMT_CREATE);

            fieldMap.put(OpenUserDO.GMT_MODIFIED,OpenUserDO.DB_GMT_MODIFIED);
            fieldMap.put(OpenUserDO.DB_GMT_MODIFIED,OpenUserDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<OpenUserDO> listByOpenId(String openId, String... fieldNames){
            return this.openUserMapper.listByOpenId(openId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByOpenId(String openId, String... fieldNames){
            return this.openUserMapper.mapByOpenId(openId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOpenId(String openId){
            return this.openUserMapper.countByOpenId(openId);
        }

        public Integer updateNotNullFieldsByOpenId(OpenUserDO updateDO, String openId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByOpenId(updateDO,openId);
        }

        public Integer updateAllFieldsByOpenId(OpenUserDO updateDO,  String openId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByOpenId(updateDO,openId);
        }

        public Integer deleteByOpenId( String openId){
            return this.openUserMapper.deleteByOpenId(openId);
        }



        public List<OpenUserDO> listByInOpenId(Collection<String> openIdList, String... fieldNames){
            return this.openUserMapper.listByInOpenId(openIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInOpenId(Collection<String> openIdList, String... fieldNames){
            return this.openUserMapper.mapByInOpenId(openIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOpenId(Collection<String> openIdList){
            return this.openUserMapper.countByInOpenId(openIdList);
        }

        public Integer updateNotNullFieldsByInOpenId(OpenUserDO updateDO, Collection<String> openIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInOpenId(updateDO,openIdList);
        }

        public Integer updateAllFieldsByInOpenId(OpenUserDO updateDO,  Collection<String> openIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInOpenId(updateDO,openIdList);
        }

        public Integer deleteByInOpenId( Collection<String> openIdList){
            return this.openUserMapper.deleteByInOpenId(openIdList);
        }


        public List<OpenUserDO> listByUserId(Long userId, String... fieldNames){
            return this.openUserMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByUserId(Long userId, String... fieldNames){
            return this.openUserMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.openUserMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(OpenUserDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(OpenUserDO updateDO,  Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.openUserMapper.deleteByUserId(userId);
        }



        public List<OpenUserDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.openUserMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.openUserMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            return this.openUserMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(OpenUserDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(OpenUserDO updateDO,  Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            return this.openUserMapper.deleteByInUserId(userIdList);
        }


        public List<OpenUserDO> listByExamineStatus(Integer examineStatus, String... fieldNames){
            return this.openUserMapper.listByExamineStatus(examineStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByExamineStatus(Integer examineStatus, String... fieldNames){
            return this.openUserMapper.mapByExamineStatus(examineStatus,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByExamineStatus(Integer examineStatus){
            return this.openUserMapper.countByExamineStatus(examineStatus);
        }

        public Integer updateNotNullFieldsByExamineStatus(OpenUserDO updateDO, Integer examineStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByExamineStatus(updateDO,examineStatus);
        }

        public Integer updateAllFieldsByExamineStatus(OpenUserDO updateDO,  Integer examineStatus){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByExamineStatus(updateDO,examineStatus);
        }

        public Integer deleteByExamineStatus( Integer examineStatus){
            return this.openUserMapper.deleteByExamineStatus(examineStatus);
        }



        public List<OpenUserDO> listByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
            return this.openUserMapper.listByInExamineStatus(examineStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInExamineStatus(Collection<Integer> examineStatusList, String... fieldNames){
            return this.openUserMapper.mapByInExamineStatus(examineStatusList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInExamineStatus(Collection<Integer> examineStatusList){
            return this.openUserMapper.countByInExamineStatus(examineStatusList);
        }

        public Integer updateNotNullFieldsByInExamineStatus(OpenUserDO updateDO, Collection<Integer> examineStatusList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInExamineStatus(updateDO,examineStatusList);
        }

        public Integer updateAllFieldsByInExamineStatus(OpenUserDO updateDO,  Collection<Integer> examineStatusList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInExamineStatus(updateDO,examineStatusList);
        }

        public Integer deleteByInExamineStatus( Collection<Integer> examineStatusList){
            return this.openUserMapper.deleteByInExamineStatus(examineStatusList);
        }


        public List<OpenUserDO> listByWxHeadImg(String wxHeadImg, String... fieldNames){
            return this.openUserMapper.listByWxHeadImg(wxHeadImg,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByWxHeadImg(String wxHeadImg, String... fieldNames){
            return this.openUserMapper.mapByWxHeadImg(wxHeadImg,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByWxHeadImg(String wxHeadImg){
            return this.openUserMapper.countByWxHeadImg(wxHeadImg);
        }

        public Integer updateNotNullFieldsByWxHeadImg(OpenUserDO updateDO, String wxHeadImg){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByWxHeadImg(updateDO,wxHeadImg);
        }

        public Integer updateAllFieldsByWxHeadImg(OpenUserDO updateDO,  String wxHeadImg){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByWxHeadImg(updateDO,wxHeadImg);
        }

        public Integer deleteByWxHeadImg( String wxHeadImg){
            return this.openUserMapper.deleteByWxHeadImg(wxHeadImg);
        }



        public List<OpenUserDO> listByInWxHeadImg(Collection<String> wxHeadImgList, String... fieldNames){
            return this.openUserMapper.listByInWxHeadImg(wxHeadImgList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInWxHeadImg(Collection<String> wxHeadImgList, String... fieldNames){
            return this.openUserMapper.mapByInWxHeadImg(wxHeadImgList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInWxHeadImg(Collection<String> wxHeadImgList){
            return this.openUserMapper.countByInWxHeadImg(wxHeadImgList);
        }

        public Integer updateNotNullFieldsByInWxHeadImg(OpenUserDO updateDO, Collection<String> wxHeadImgList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInWxHeadImg(updateDO,wxHeadImgList);
        }

        public Integer updateAllFieldsByInWxHeadImg(OpenUserDO updateDO,  Collection<String> wxHeadImgList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInWxHeadImg(updateDO,wxHeadImgList);
        }

        public Integer deleteByInWxHeadImg( Collection<String> wxHeadImgList){
            return this.openUserMapper.deleteByInWxHeadImg(wxHeadImgList);
        }


        public List<OpenUserDO> listByNickName(String nickName, String... fieldNames){
            return this.openUserMapper.listByNickName(nickName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByNickName(String nickName, String... fieldNames){
            return this.openUserMapper.mapByNickName(nickName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByNickName(String nickName){
            return this.openUserMapper.countByNickName(nickName);
        }

        public Integer updateNotNullFieldsByNickName(OpenUserDO updateDO, String nickName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByNickName(updateDO,nickName);
        }

        public Integer updateAllFieldsByNickName(OpenUserDO updateDO,  String nickName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByNickName(updateDO,nickName);
        }

        public Integer deleteByNickName( String nickName){
            return this.openUserMapper.deleteByNickName(nickName);
        }



        public List<OpenUserDO> listByInNickName(Collection<String> nickNameList, String... fieldNames){
            return this.openUserMapper.listByInNickName(nickNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInNickName(Collection<String> nickNameList, String... fieldNames){
            return this.openUserMapper.mapByInNickName(nickNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInNickName(Collection<String> nickNameList){
            return this.openUserMapper.countByInNickName(nickNameList);
        }

        public Integer updateNotNullFieldsByInNickName(OpenUserDO updateDO, Collection<String> nickNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInNickName(updateDO,nickNameList);
        }

        public Integer updateAllFieldsByInNickName(OpenUserDO updateDO,  Collection<String> nickNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInNickName(updateDO,nickNameList);
        }

        public Integer deleteByInNickName( Collection<String> nickNameList){
            return this.openUserMapper.deleteByInNickName(nickNameList);
        }


        public List<OpenUserDO> listByWxPhoneNum(String wxPhoneNum, String... fieldNames){
            return this.openUserMapper.listByWxPhoneNum(wxPhoneNum,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByWxPhoneNum(String wxPhoneNum, String... fieldNames){
            return this.openUserMapper.mapByWxPhoneNum(wxPhoneNum,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByWxPhoneNum(String wxPhoneNum){
            return this.openUserMapper.countByWxPhoneNum(wxPhoneNum);
        }

        public Integer updateNotNullFieldsByWxPhoneNum(OpenUserDO updateDO, String wxPhoneNum){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByWxPhoneNum(updateDO,wxPhoneNum);
        }

        public Integer updateAllFieldsByWxPhoneNum(OpenUserDO updateDO,  String wxPhoneNum){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByWxPhoneNum(updateDO,wxPhoneNum);
        }

        public Integer deleteByWxPhoneNum( String wxPhoneNum){
            return this.openUserMapper.deleteByWxPhoneNum(wxPhoneNum);
        }



        public List<OpenUserDO> listByInWxPhoneNum(Collection<String> wxPhoneNumList, String... fieldNames){
            return this.openUserMapper.listByInWxPhoneNum(wxPhoneNumList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInWxPhoneNum(Collection<String> wxPhoneNumList, String... fieldNames){
            return this.openUserMapper.mapByInWxPhoneNum(wxPhoneNumList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInWxPhoneNum(Collection<String> wxPhoneNumList){
            return this.openUserMapper.countByInWxPhoneNum(wxPhoneNumList);
        }

        public Integer updateNotNullFieldsByInWxPhoneNum(OpenUserDO updateDO, Collection<String> wxPhoneNumList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInWxPhoneNum(updateDO,wxPhoneNumList);
        }

        public Integer updateAllFieldsByInWxPhoneNum(OpenUserDO updateDO,  Collection<String> wxPhoneNumList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInWxPhoneNum(updateDO,wxPhoneNumList);
        }

        public Integer deleteByInWxPhoneNum( Collection<String> wxPhoneNumList){
            return this.openUserMapper.deleteByInWxPhoneNum(wxPhoneNumList);
        }


        public List<OpenUserDO> listByWxGender(Integer wxGender, String... fieldNames){
            return this.openUserMapper.listByWxGender(wxGender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByWxGender(Integer wxGender, String... fieldNames){
            return this.openUserMapper.mapByWxGender(wxGender,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByWxGender(Integer wxGender){
            return this.openUserMapper.countByWxGender(wxGender);
        }

        public Integer updateNotNullFieldsByWxGender(OpenUserDO updateDO, Integer wxGender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByWxGender(updateDO,wxGender);
        }

        public Integer updateAllFieldsByWxGender(OpenUserDO updateDO,  Integer wxGender){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByWxGender(updateDO,wxGender);
        }

        public Integer deleteByWxGender( Integer wxGender){
            return this.openUserMapper.deleteByWxGender(wxGender);
        }



        public List<OpenUserDO> listByInWxGender(Collection<Integer> wxGenderList, String... fieldNames){
            return this.openUserMapper.listByInWxGender(wxGenderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInWxGender(Collection<Integer> wxGenderList, String... fieldNames){
            return this.openUserMapper.mapByInWxGender(wxGenderList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInWxGender(Collection<Integer> wxGenderList){
            return this.openUserMapper.countByInWxGender(wxGenderList);
        }

        public Integer updateNotNullFieldsByInWxGender(OpenUserDO updateDO, Collection<Integer> wxGenderList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInWxGender(updateDO,wxGenderList);
        }

        public Integer updateAllFieldsByInWxGender(OpenUserDO updateDO,  Collection<Integer> wxGenderList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInWxGender(updateDO,wxGenderList);
        }

        public Integer deleteByInWxGender( Collection<Integer> wxGenderList){
            return this.openUserMapper.deleteByInWxGender(wxGenderList);
        }


        public List<OpenUserDO> listByWxAppId(String wxAppId, String... fieldNames){
            return this.openUserMapper.listByWxAppId(wxAppId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByWxAppId(String wxAppId, String... fieldNames){
            return this.openUserMapper.mapByWxAppId(wxAppId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByWxAppId(String wxAppId){
            return this.openUserMapper.countByWxAppId(wxAppId);
        }

        public Integer updateNotNullFieldsByWxAppId(OpenUserDO updateDO, String wxAppId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByWxAppId(updateDO,wxAppId);
        }

        public Integer updateAllFieldsByWxAppId(OpenUserDO updateDO,  String wxAppId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByWxAppId(updateDO,wxAppId);
        }

        public Integer deleteByWxAppId( String wxAppId){
            return this.openUserMapper.deleteByWxAppId(wxAppId);
        }



        public List<OpenUserDO> listByInWxAppId(Collection<String> wxAppIdList, String... fieldNames){
            return this.openUserMapper.listByInWxAppId(wxAppIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInWxAppId(Collection<String> wxAppIdList, String... fieldNames){
            return this.openUserMapper.mapByInWxAppId(wxAppIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInWxAppId(Collection<String> wxAppIdList){
            return this.openUserMapper.countByInWxAppId(wxAppIdList);
        }

        public Integer updateNotNullFieldsByInWxAppId(OpenUserDO updateDO, Collection<String> wxAppIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInWxAppId(updateDO,wxAppIdList);
        }

        public Integer updateAllFieldsByInWxAppId(OpenUserDO updateDO,  Collection<String> wxAppIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInWxAppId(updateDO,wxAppIdList);
        }

        public Integer deleteByInWxAppId( Collection<String> wxAppIdList){
            return this.openUserMapper.deleteByInWxAppId(wxAppIdList);
        }


        public List<OpenUserDO> listByUnionId(String unionId, String... fieldNames){
            return this.openUserMapper.listByUnionId(unionId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByUnionId(String unionId, String... fieldNames){
            return this.openUserMapper.mapByUnionId(unionId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUnionId(String unionId){
            return this.openUserMapper.countByUnionId(unionId);
        }

        public Integer updateNotNullFieldsByUnionId(OpenUserDO updateDO, String unionId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByUnionId(updateDO,unionId);
        }

        public Integer updateAllFieldsByUnionId(OpenUserDO updateDO,  String unionId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByUnionId(updateDO,unionId);
        }

        public Integer deleteByUnionId( String unionId){
            return this.openUserMapper.deleteByUnionId(unionId);
        }



        public List<OpenUserDO> listByInUnionId(Collection<String> unionIdList, String... fieldNames){
            return this.openUserMapper.listByInUnionId(unionIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OpenUserDO> mapByInUnionId(Collection<String> unionIdList, String... fieldNames){
            return this.openUserMapper.mapByInUnionId(unionIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUnionId(Collection<String> unionIdList){
            return this.openUserMapper.countByInUnionId(unionIdList);
        }

        public Integer updateNotNullFieldsByInUnionId(OpenUserDO updateDO, Collection<String> unionIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateNotNullFieldsByInUnionId(updateDO,unionIdList);
        }

        public Integer updateAllFieldsByInUnionId(OpenUserDO updateDO,  Collection<String> unionIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.openUserMapper.updateAllFieldsByInUnionId(updateDO,unionIdList);
        }

        public Integer deleteByInUnionId( Collection<String> unionIdList){
            return this.openUserMapper.deleteByInUnionId(unionIdList);
        }


}

