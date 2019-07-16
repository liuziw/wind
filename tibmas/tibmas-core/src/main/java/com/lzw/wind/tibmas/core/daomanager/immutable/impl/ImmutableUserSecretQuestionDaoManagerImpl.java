package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableUserSecretQuestionDaoManager;
import com.hyzs.tibmas.core.dbo.UserSecretQuestionDO;
import com.hyzs.tibmas.core.mapper.UserSecretQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserSecretQuestionDaoManagerImpl extends CommonDaoManagerImpl<UserSecretQuestionDO,Long> implements ImmutableUserSecretQuestionDaoManager {

        @Autowired
        private UserSecretQuestionMapper userSecretQuestionMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userSecretQuestionMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserSecretQuestionDO.ID,UserSecretQuestionDO.DB_ID);
            fieldMap.put(UserSecretQuestionDO.DB_ID,UserSecretQuestionDO.DB_ID);

            fieldMap.put(UserSecretQuestionDO.USER_ACCOUNT,UserSecretQuestionDO.DB_USER_ACCOUNT);
            fieldMap.put(UserSecretQuestionDO.DB_USER_ACCOUNT,UserSecretQuestionDO.DB_USER_ACCOUNT);

            fieldMap.put(UserSecretQuestionDO.QUESTION_ID,UserSecretQuestionDO.DB_QUESTION_ID);
            fieldMap.put(UserSecretQuestionDO.DB_QUESTION_ID,UserSecretQuestionDO.DB_QUESTION_ID);

            fieldMap.put(UserSecretQuestionDO.QUESTION_ANSWER,UserSecretQuestionDO.DB_QUESTION_ANSWER);
            fieldMap.put(UserSecretQuestionDO.DB_QUESTION_ANSWER,UserSecretQuestionDO.DB_QUESTION_ANSWER);

            fieldMap.put(UserSecretQuestionDO.SEQ,UserSecretQuestionDO.DB_SEQ);
            fieldMap.put(UserSecretQuestionDO.DB_SEQ,UserSecretQuestionDO.DB_SEQ);

            fieldMap.put(UserSecretQuestionDO.GMT_CREATE,UserSecretQuestionDO.DB_GMT_CREATE);
            fieldMap.put(UserSecretQuestionDO.DB_GMT_CREATE,UserSecretQuestionDO.DB_GMT_CREATE);

            fieldMap.put(UserSecretQuestionDO.GMT_MODIFIED,UserSecretQuestionDO.DB_GMT_MODIFIED);
            fieldMap.put(UserSecretQuestionDO.DB_GMT_MODIFIED,UserSecretQuestionDO.DB_GMT_MODIFIED);

            fieldMap.put(UserSecretQuestionDO.IS_DELETED,UserSecretQuestionDO.DB_IS_DELETED);
            fieldMap.put(UserSecretQuestionDO.DB_IS_DELETED,UserSecretQuestionDO.DB_IS_DELETED);

            fieldMap.put(UserSecretQuestionDO.USER_ID_CREATE,UserSecretQuestionDO.DB_USER_ID_CREATE);
            fieldMap.put(UserSecretQuestionDO.DB_USER_ID_CREATE,UserSecretQuestionDO.DB_USER_ID_CREATE);

            fieldMap.put(UserSecretQuestionDO.USER_ID_MODIFIED,UserSecretQuestionDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserSecretQuestionDO.DB_USER_ID_MODIFIED,UserSecretQuestionDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<UserSecretQuestionDO> listByUserAccount(String userAccount, String... fieldNames){
            return this.userSecretQuestionMapper.listByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByUserAccount(String userAccount, String... fieldNames){
            return this.userSecretQuestionMapper.mapByUserAccount(userAccount,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserAccount(String userAccount){
            return this.userSecretQuestionMapper.countByUserAccount(userAccount);
        }

        public Integer updateNotNullFieldsByUserAccount(UserSecretQuestionDO updateDO, String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer updateAllFieldsByUserAccount(UserSecretQuestionDO updateDO,  String userAccount){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByUserAccount(updateDO,userAccount);
        }

        public Integer deleteByUserAccount( String userAccount){
            return this.userSecretQuestionMapper.deleteByUserAccount(userAccount);
        }



        public List<UserSecretQuestionDO> listByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInUserAccount(Collection<String> userAccountList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInUserAccount(userAccountList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserAccount(Collection<String> userAccountList){
            return this.userSecretQuestionMapper.countByInUserAccount(userAccountList);
        }

        public Integer updateNotNullFieldsByInUserAccount(UserSecretQuestionDO updateDO, Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer updateAllFieldsByInUserAccount(UserSecretQuestionDO updateDO,  Collection<String> userAccountList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInUserAccount(updateDO,userAccountList);
        }

        public Integer deleteByInUserAccount( Collection<String> userAccountList){
            return this.userSecretQuestionMapper.deleteByInUserAccount(userAccountList);
        }


        public List<UserSecretQuestionDO> listByQuestionId(Long questionId, String... fieldNames){
            return this.userSecretQuestionMapper.listByQuestionId(questionId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByQuestionId(Long questionId, String... fieldNames){
            return this.userSecretQuestionMapper.mapByQuestionId(questionId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByQuestionId(Long questionId){
            return this.userSecretQuestionMapper.countByQuestionId(questionId);
        }

        public Integer updateNotNullFieldsByQuestionId(UserSecretQuestionDO updateDO, Long questionId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByQuestionId(updateDO,questionId);
        }

        public Integer updateAllFieldsByQuestionId(UserSecretQuestionDO updateDO,  Long questionId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByQuestionId(updateDO,questionId);
        }

        public Integer deleteByQuestionId( Long questionId){
            return this.userSecretQuestionMapper.deleteByQuestionId(questionId);
        }



        public List<UserSecretQuestionDO> listByInQuestionId(Collection<Long> questionIdList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInQuestionId(questionIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInQuestionId(Collection<Long> questionIdList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInQuestionId(questionIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInQuestionId(Collection<Long> questionIdList){
            return this.userSecretQuestionMapper.countByInQuestionId(questionIdList);
        }

        public Integer updateNotNullFieldsByInQuestionId(UserSecretQuestionDO updateDO, Collection<Long> questionIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInQuestionId(updateDO,questionIdList);
        }

        public Integer updateAllFieldsByInQuestionId(UserSecretQuestionDO updateDO,  Collection<Long> questionIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInQuestionId(updateDO,questionIdList);
        }

        public Integer deleteByInQuestionId( Collection<Long> questionIdList){
            return this.userSecretQuestionMapper.deleteByInQuestionId(questionIdList);
        }


        public List<UserSecretQuestionDO> listByQuestionAnswer(String questionAnswer, String... fieldNames){
            return this.userSecretQuestionMapper.listByQuestionAnswer(questionAnswer,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByQuestionAnswer(String questionAnswer, String... fieldNames){
            return this.userSecretQuestionMapper.mapByQuestionAnswer(questionAnswer,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByQuestionAnswer(String questionAnswer){
            return this.userSecretQuestionMapper.countByQuestionAnswer(questionAnswer);
        }

        public Integer updateNotNullFieldsByQuestionAnswer(UserSecretQuestionDO updateDO, String questionAnswer){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByQuestionAnswer(updateDO,questionAnswer);
        }

        public Integer updateAllFieldsByQuestionAnswer(UserSecretQuestionDO updateDO,  String questionAnswer){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByQuestionAnswer(updateDO,questionAnswer);
        }

        public Integer deleteByQuestionAnswer( String questionAnswer){
            return this.userSecretQuestionMapper.deleteByQuestionAnswer(questionAnswer);
        }



        public List<UserSecretQuestionDO> listByInQuestionAnswer(Collection<String> questionAnswerList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInQuestionAnswer(questionAnswerList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInQuestionAnswer(Collection<String> questionAnswerList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInQuestionAnswer(questionAnswerList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInQuestionAnswer(Collection<String> questionAnswerList){
            return this.userSecretQuestionMapper.countByInQuestionAnswer(questionAnswerList);
        }

        public Integer updateNotNullFieldsByInQuestionAnswer(UserSecretQuestionDO updateDO, Collection<String> questionAnswerList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInQuestionAnswer(updateDO,questionAnswerList);
        }

        public Integer updateAllFieldsByInQuestionAnswer(UserSecretQuestionDO updateDO,  Collection<String> questionAnswerList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInQuestionAnswer(updateDO,questionAnswerList);
        }

        public Integer deleteByInQuestionAnswer( Collection<String> questionAnswerList){
            return this.userSecretQuestionMapper.deleteByInQuestionAnswer(questionAnswerList);
        }


        public List<UserSecretQuestionDO> listBySeq(Integer seq, String... fieldNames){
            return this.userSecretQuestionMapper.listBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapBySeq(Integer seq, String... fieldNames){
            return this.userSecretQuestionMapper.mapBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySeq(Integer seq){
            return this.userSecretQuestionMapper.countBySeq(seq);
        }

        public Integer updateNotNullFieldsBySeq(UserSecretQuestionDO updateDO, Integer seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsBySeq(updateDO,seq);
        }

        public Integer updateAllFieldsBySeq(UserSecretQuestionDO updateDO,  Integer seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsBySeq(updateDO,seq);
        }

        public Integer deleteBySeq( Integer seq){
            return this.userSecretQuestionMapper.deleteBySeq(seq);
        }



        public List<UserSecretQuestionDO> listByInSeq(Collection<Integer> seqList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInSeq(Collection<Integer> seqList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSeq(Collection<Integer> seqList){
            return this.userSecretQuestionMapper.countByInSeq(seqList);
        }

        public Integer updateNotNullFieldsByInSeq(UserSecretQuestionDO updateDO, Collection<Integer> seqList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInSeq(updateDO,seqList);
        }

        public Integer updateAllFieldsByInSeq(UserSecretQuestionDO updateDO,  Collection<Integer> seqList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInSeq(updateDO,seqList);
        }

        public Integer deleteByInSeq( Collection<Integer> seqList){
            return this.userSecretQuestionMapper.deleteByInSeq(seqList);
        }


        public List<UserSecretQuestionDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userSecretQuestionMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userSecretQuestionMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userSecretQuestionMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserSecretQuestionDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserSecretQuestionDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userSecretQuestionMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserSecretQuestionDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.userSecretQuestionMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserSecretQuestionDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserSecretQuestionDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.userSecretQuestionMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserSecretQuestionDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userSecretQuestionMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userSecretQuestionMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userSecretQuestionMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserSecretQuestionDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserSecretQuestionDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userSecretQuestionMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserSecretQuestionDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userSecretQuestionMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserSecretQuestionDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userSecretQuestionMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.userSecretQuestionMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserSecretQuestionDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserSecretQuestionDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userSecretQuestionMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.userSecretQuestionMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

