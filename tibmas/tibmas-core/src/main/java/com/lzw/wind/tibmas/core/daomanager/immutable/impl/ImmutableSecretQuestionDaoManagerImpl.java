package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableSecretQuestionDaoManager;
import com.hyzs.tibmas.core.dbo.SecretQuestionDO;
import com.hyzs.tibmas.core.mapper.SecretQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableSecretQuestionDaoManagerImpl extends CommonDaoManagerImpl<SecretQuestionDO,Long> implements ImmutableSecretQuestionDaoManager {

        @Autowired
        private SecretQuestionMapper secretQuestionMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(secretQuestionMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(SecretQuestionDO.ID,SecretQuestionDO.DB_ID);
            fieldMap.put(SecretQuestionDO.DB_ID,SecretQuestionDO.DB_ID);

            fieldMap.put(SecretQuestionDO.QUESTION_DESC,SecretQuestionDO.DB_QUESTION_DESC);
            fieldMap.put(SecretQuestionDO.DB_QUESTION_DESC,SecretQuestionDO.DB_QUESTION_DESC);

            fieldMap.put(SecretQuestionDO.SEQ,SecretQuestionDO.DB_SEQ);
            fieldMap.put(SecretQuestionDO.DB_SEQ,SecretQuestionDO.DB_SEQ);

            fieldMap.put(SecretQuestionDO.GMT_CREATE,SecretQuestionDO.DB_GMT_CREATE);
            fieldMap.put(SecretQuestionDO.DB_GMT_CREATE,SecretQuestionDO.DB_GMT_CREATE);

            fieldMap.put(SecretQuestionDO.GMT_MODIFIED,SecretQuestionDO.DB_GMT_MODIFIED);
            fieldMap.put(SecretQuestionDO.DB_GMT_MODIFIED,SecretQuestionDO.DB_GMT_MODIFIED);

            fieldMap.put(SecretQuestionDO.IS_DELETED,SecretQuestionDO.DB_IS_DELETED);
            fieldMap.put(SecretQuestionDO.DB_IS_DELETED,SecretQuestionDO.DB_IS_DELETED);

            fieldMap.put(SecretQuestionDO.USER_ID_CREATE,SecretQuestionDO.DB_USER_ID_CREATE);
            fieldMap.put(SecretQuestionDO.DB_USER_ID_CREATE,SecretQuestionDO.DB_USER_ID_CREATE);

            fieldMap.put(SecretQuestionDO.USER_ID_MODIFIED,SecretQuestionDO.DB_USER_ID_MODIFIED);
            fieldMap.put(SecretQuestionDO.DB_USER_ID_MODIFIED,SecretQuestionDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<SecretQuestionDO> listByQuestionDesc(String questionDesc, String... fieldNames){
            return this.secretQuestionMapper.listByQuestionDesc(questionDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByQuestionDesc(String questionDesc, String... fieldNames){
            return this.secretQuestionMapper.mapByQuestionDesc(questionDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByQuestionDesc(String questionDesc){
            return this.secretQuestionMapper.countByQuestionDesc(questionDesc);
        }

        public Integer updateNotNullFieldsByQuestionDesc(SecretQuestionDO updateDO, String questionDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByQuestionDesc(updateDO,questionDesc);
        }

        public Integer updateAllFieldsByQuestionDesc(SecretQuestionDO updateDO,  String questionDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByQuestionDesc(updateDO,questionDesc);
        }

        public Integer deleteByQuestionDesc( String questionDesc){
            return this.secretQuestionMapper.deleteByQuestionDesc(questionDesc);
        }



        public List<SecretQuestionDO> listByInQuestionDesc(Collection<String> questionDescList, String... fieldNames){
            return this.secretQuestionMapper.listByInQuestionDesc(questionDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByInQuestionDesc(Collection<String> questionDescList, String... fieldNames){
            return this.secretQuestionMapper.mapByInQuestionDesc(questionDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInQuestionDesc(Collection<String> questionDescList){
            return this.secretQuestionMapper.countByInQuestionDesc(questionDescList);
        }

        public Integer updateNotNullFieldsByInQuestionDesc(SecretQuestionDO updateDO, Collection<String> questionDescList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByInQuestionDesc(updateDO,questionDescList);
        }

        public Integer updateAllFieldsByInQuestionDesc(SecretQuestionDO updateDO,  Collection<String> questionDescList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByInQuestionDesc(updateDO,questionDescList);
        }

        public Integer deleteByInQuestionDesc( Collection<String> questionDescList){
            return this.secretQuestionMapper.deleteByInQuestionDesc(questionDescList);
        }


        public List<SecretQuestionDO> listBySeq(Long seq, String... fieldNames){
            return this.secretQuestionMapper.listBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapBySeq(Long seq, String... fieldNames){
            return this.secretQuestionMapper.mapBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySeq(Long seq){
            return this.secretQuestionMapper.countBySeq(seq);
        }

        public Integer updateNotNullFieldsBySeq(SecretQuestionDO updateDO, Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsBySeq(updateDO,seq);
        }

        public Integer updateAllFieldsBySeq(SecretQuestionDO updateDO,  Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsBySeq(updateDO,seq);
        }

        public Integer deleteBySeq( Long seq){
            return this.secretQuestionMapper.deleteBySeq(seq);
        }



        public List<SecretQuestionDO> listByInSeq(Collection<Long> seqList, String... fieldNames){
            return this.secretQuestionMapper.listByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByInSeq(Collection<Long> seqList, String... fieldNames){
            return this.secretQuestionMapper.mapByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSeq(Collection<Long> seqList){
            return this.secretQuestionMapper.countByInSeq(seqList);
        }

        public Integer updateNotNullFieldsByInSeq(SecretQuestionDO updateDO, Collection<Long> seqList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByInSeq(updateDO,seqList);
        }

        public Integer updateAllFieldsByInSeq(SecretQuestionDO updateDO,  Collection<Long> seqList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByInSeq(updateDO,seqList);
        }

        public Integer deleteByInSeq( Collection<Long> seqList){
            return this.secretQuestionMapper.deleteByInSeq(seqList);
        }


        public List<SecretQuestionDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.secretQuestionMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.secretQuestionMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.secretQuestionMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(SecretQuestionDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(SecretQuestionDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.secretQuestionMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<SecretQuestionDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.secretQuestionMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.secretQuestionMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.secretQuestionMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(SecretQuestionDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(SecretQuestionDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.secretQuestionMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<SecretQuestionDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.secretQuestionMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.secretQuestionMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.secretQuestionMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(SecretQuestionDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(SecretQuestionDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.secretQuestionMapper.deleteByUserIdModified(userIdModified);
        }



        public List<SecretQuestionDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.secretQuestionMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,SecretQuestionDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.secretQuestionMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.secretQuestionMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(SecretQuestionDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(SecretQuestionDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.secretQuestionMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.secretQuestionMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

