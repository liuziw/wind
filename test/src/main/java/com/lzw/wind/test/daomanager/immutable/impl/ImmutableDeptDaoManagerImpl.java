package com.lzw.wind.test.daomanager.immutable.impl;

import com.lzw.wind.test.dbo.DeptDO;
import com.hyzs.gz.common.dao.manager.DOChecker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.lzw.wind.test.daomanager.immutable.ImmutableDeptDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.test.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.ArrayList;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableDeptDaoManagerImpl extends CommonDaoManagerImpl<DeptDO,Long> implements ImmutableDeptDaoManager {

        @Autowired
        private DeptMapper deptMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(deptMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(DeptDO.ID,DeptDO.DB_ID);
            fieldMap.put(DeptDO.DB_ID,DeptDO.DB_ID);

            fieldMap.put(DeptDO.DEPT_CODE,DeptDO.DB_DEPT_CODE);
            fieldMap.put(DeptDO.DB_DEPT_CODE,DeptDO.DB_DEPT_CODE);

            fieldMap.put(DeptDO.DEPT_NAME,DeptDO.DB_DEPT_NAME);
            fieldMap.put(DeptDO.DB_DEPT_NAME,DeptDO.DB_DEPT_NAME);

            fieldMap.put(DeptDO.DEPT_DESCRIBE,DeptDO.DB_DEPT_DESCRIBE);
            fieldMap.put(DeptDO.DB_DEPT_DESCRIBE,DeptDO.DB_DEPT_DESCRIBE);

            fieldMap.put(DeptDO.DEPT_TYPE,DeptDO.DB_DEPT_TYPE);
            fieldMap.put(DeptDO.DB_DEPT_TYPE,DeptDO.DB_DEPT_TYPE);

            fieldMap.put(DeptDO.AREA_ID,DeptDO.DB_AREA_ID);
            fieldMap.put(DeptDO.DB_AREA_ID,DeptDO.DB_AREA_ID);

            fieldMap.put(DeptDO.PID,DeptDO.DB_PID);
            fieldMap.put(DeptDO.DB_PID,DeptDO.DB_PID);

            fieldMap.put(DeptDO.SEQ,DeptDO.DB_SEQ);
            fieldMap.put(DeptDO.DB_SEQ,DeptDO.DB_SEQ);

            fieldMap.put(DeptDO.IS_DELETED,DeptDO.DB_IS_DELETED);
            fieldMap.put(DeptDO.DB_IS_DELETED,DeptDO.DB_IS_DELETED);

            fieldMap.put(DeptDO.GMT_CREATE,DeptDO.DB_GMT_CREATE);
            fieldMap.put(DeptDO.DB_GMT_CREATE,DeptDO.DB_GMT_CREATE);

            fieldMap.put(DeptDO.GMT_MODIFIED,DeptDO.DB_GMT_MODIFIED);
            fieldMap.put(DeptDO.DB_GMT_MODIFIED,DeptDO.DB_GMT_MODIFIED);

            fieldMap.put(DeptDO.USER_ID_CREATE,DeptDO.DB_USER_ID_CREATE);
            fieldMap.put(DeptDO.DB_USER_ID_CREATE,DeptDO.DB_USER_ID_CREATE);

            fieldMap.put(DeptDO.USER_ID_MODIFIED,DeptDO.DB_USER_ID_MODIFIED);
            fieldMap.put(DeptDO.DB_USER_ID_MODIFIED,DeptDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public DeptDO getById(Long id){
            return this.deptMapper.getById(id);
        }



        public List<DeptDO> listById(Long id, String... fieldNames){
            return this.deptMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapById(Long id, String... fieldNames){
            return this.deptMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.deptMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(DeptDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(DeptDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.deptMapper.deleteById(id);
        }



        public List<DeptDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.deptMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(DeptDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(DeptDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.deptMapper.deleteByInId(idList);
        }


        public List<DeptDO> listByDeptCode(String deptCode, String... fieldNames){
            return this.deptMapper.listByDeptCode(deptCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByDeptCode(String deptCode, String... fieldNames){
            return this.deptMapper.mapByDeptCode(deptCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptCode(String deptCode){
            return this.deptMapper.countByDeptCode(deptCode);
        }

        public Integer updateNotNullFieldsByDeptCode(DeptDO updateDO, String deptCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByDeptCode(updateDO,deptCode);
        }

        public Integer updateAllFieldsByDeptCode(DeptDO updateDO,  String deptCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByDeptCode(updateDO,deptCode);
        }

        public Integer deleteByDeptCode( String deptCode){
            return this.deptMapper.deleteByDeptCode(deptCode);
        }



        public List<DeptDO> listByInDeptCode(Collection<String> deptCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptCodeList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInDeptCode(deptCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInDeptCode(Collection<String> deptCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptCodeList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInDeptCode(deptCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptCode(Collection<String> deptCodeList){
            if(CollectionUtils.isEmpty(deptCodeList)){
                   return 0;
             }
            return this.deptMapper.countByInDeptCode(deptCodeList);
        }

        public Integer updateNotNullFieldsByInDeptCode(DeptDO updateDO, Collection<String> deptCodeList){
            if(CollectionUtils.isEmpty(deptCodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInDeptCode(updateDO,deptCodeList);
        }

        public Integer updateAllFieldsByInDeptCode(DeptDO updateDO,  Collection<String> deptCodeList){
            if(CollectionUtils.isEmpty(deptCodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInDeptCode(updateDO,deptCodeList);
        }

        public Integer deleteByInDeptCode( Collection<String> deptCodeList){
            if(CollectionUtils.isEmpty(deptCodeList)){
                           return 0;
             }
            return this.deptMapper.deleteByInDeptCode(deptCodeList);
        }


        public List<DeptDO> listByDeptName(String deptName, String... fieldNames){
            return this.deptMapper.listByDeptName(deptName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByDeptName(String deptName, String... fieldNames){
            return this.deptMapper.mapByDeptName(deptName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptName(String deptName){
            return this.deptMapper.countByDeptName(deptName);
        }

        public Integer updateNotNullFieldsByDeptName(DeptDO updateDO, String deptName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByDeptName(updateDO,deptName);
        }

        public Integer updateAllFieldsByDeptName(DeptDO updateDO,  String deptName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByDeptName(updateDO,deptName);
        }

        public Integer deleteByDeptName( String deptName){
            return this.deptMapper.deleteByDeptName(deptName);
        }



        public List<DeptDO> listByInDeptName(Collection<String> deptNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptNameList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInDeptName(deptNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInDeptName(Collection<String> deptNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptNameList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInDeptName(deptNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptName(Collection<String> deptNameList){
            if(CollectionUtils.isEmpty(deptNameList)){
                   return 0;
             }
            return this.deptMapper.countByInDeptName(deptNameList);
        }

        public Integer updateNotNullFieldsByInDeptName(DeptDO updateDO, Collection<String> deptNameList){
            if(CollectionUtils.isEmpty(deptNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInDeptName(updateDO,deptNameList);
        }

        public Integer updateAllFieldsByInDeptName(DeptDO updateDO,  Collection<String> deptNameList){
            if(CollectionUtils.isEmpty(deptNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInDeptName(updateDO,deptNameList);
        }

        public Integer deleteByInDeptName( Collection<String> deptNameList){
            if(CollectionUtils.isEmpty(deptNameList)){
                           return 0;
             }
            return this.deptMapper.deleteByInDeptName(deptNameList);
        }


        public List<DeptDO> listByDeptDescribe(String deptDescribe, String... fieldNames){
            return this.deptMapper.listByDeptDescribe(deptDescribe,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByDeptDescribe(String deptDescribe, String... fieldNames){
            return this.deptMapper.mapByDeptDescribe(deptDescribe,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptDescribe(String deptDescribe){
            return this.deptMapper.countByDeptDescribe(deptDescribe);
        }

        public Integer updateNotNullFieldsByDeptDescribe(DeptDO updateDO, String deptDescribe){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByDeptDescribe(updateDO,deptDescribe);
        }

        public Integer updateAllFieldsByDeptDescribe(DeptDO updateDO,  String deptDescribe){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByDeptDescribe(updateDO,deptDescribe);
        }

        public Integer deleteByDeptDescribe( String deptDescribe){
            return this.deptMapper.deleteByDeptDescribe(deptDescribe);
        }



        public List<DeptDO> listByInDeptDescribe(Collection<String> deptDescribeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInDeptDescribe(deptDescribeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInDeptDescribe(Collection<String> deptDescribeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInDeptDescribe(deptDescribeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptDescribe(Collection<String> deptDescribeList){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                   return 0;
             }
            return this.deptMapper.countByInDeptDescribe(deptDescribeList);
        }

        public Integer updateNotNullFieldsByInDeptDescribe(DeptDO updateDO, Collection<String> deptDescribeList){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInDeptDescribe(updateDO,deptDescribeList);
        }

        public Integer updateAllFieldsByInDeptDescribe(DeptDO updateDO,  Collection<String> deptDescribeList){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInDeptDescribe(updateDO,deptDescribeList);
        }

        public Integer deleteByInDeptDescribe( Collection<String> deptDescribeList){
            if(CollectionUtils.isEmpty(deptDescribeList)){
                           return 0;
             }
            return this.deptMapper.deleteByInDeptDescribe(deptDescribeList);
        }


        public List<DeptDO> listByDeptType(Integer deptType, String... fieldNames){
            return this.deptMapper.listByDeptType(deptType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByDeptType(Integer deptType, String... fieldNames){
            return this.deptMapper.mapByDeptType(deptType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptType(Integer deptType){
            return this.deptMapper.countByDeptType(deptType);
        }

        public Integer updateNotNullFieldsByDeptType(DeptDO updateDO, Integer deptType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByDeptType(updateDO,deptType);
        }

        public Integer updateAllFieldsByDeptType(DeptDO updateDO,  Integer deptType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByDeptType(updateDO,deptType);
        }

        public Integer deleteByDeptType( Integer deptType){
            return this.deptMapper.deleteByDeptType(deptType);
        }



        public List<DeptDO> listByInDeptType(Collection<Integer> deptTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptTypeList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInDeptType(deptTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInDeptType(Collection<Integer> deptTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(deptTypeList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInDeptType(deptTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptType(Collection<Integer> deptTypeList){
            if(CollectionUtils.isEmpty(deptTypeList)){
                   return 0;
             }
            return this.deptMapper.countByInDeptType(deptTypeList);
        }

        public Integer updateNotNullFieldsByInDeptType(DeptDO updateDO, Collection<Integer> deptTypeList){
            if(CollectionUtils.isEmpty(deptTypeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInDeptType(updateDO,deptTypeList);
        }

        public Integer updateAllFieldsByInDeptType(DeptDO updateDO,  Collection<Integer> deptTypeList){
            if(CollectionUtils.isEmpty(deptTypeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInDeptType(updateDO,deptTypeList);
        }

        public Integer deleteByInDeptType( Collection<Integer> deptTypeList){
            if(CollectionUtils.isEmpty(deptTypeList)){
                           return 0;
             }
            return this.deptMapper.deleteByInDeptType(deptTypeList);
        }


        public List<DeptDO> listByAreaId(Long areaId, String... fieldNames){
            return this.deptMapper.listByAreaId(areaId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByAreaId(Long areaId, String... fieldNames){
            return this.deptMapper.mapByAreaId(areaId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAreaId(Long areaId){
            return this.deptMapper.countByAreaId(areaId);
        }

        public Integer updateNotNullFieldsByAreaId(DeptDO updateDO, Long areaId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByAreaId(updateDO,areaId);
        }

        public Integer updateAllFieldsByAreaId(DeptDO updateDO,  Long areaId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByAreaId(updateDO,areaId);
        }

        public Integer deleteByAreaId( Long areaId){
            return this.deptMapper.deleteByAreaId(areaId);
        }



        public List<DeptDO> listByInAreaId(Collection<Long> areaIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(areaIdList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInAreaId(areaIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInAreaId(Collection<Long> areaIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(areaIdList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInAreaId(areaIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAreaId(Collection<Long> areaIdList){
            if(CollectionUtils.isEmpty(areaIdList)){
                   return 0;
             }
            return this.deptMapper.countByInAreaId(areaIdList);
        }

        public Integer updateNotNullFieldsByInAreaId(DeptDO updateDO, Collection<Long> areaIdList){
            if(CollectionUtils.isEmpty(areaIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInAreaId(updateDO,areaIdList);
        }

        public Integer updateAllFieldsByInAreaId(DeptDO updateDO,  Collection<Long> areaIdList){
            if(CollectionUtils.isEmpty(areaIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInAreaId(updateDO,areaIdList);
        }

        public Integer deleteByInAreaId( Collection<Long> areaIdList){
            if(CollectionUtils.isEmpty(areaIdList)){
                           return 0;
             }
            return this.deptMapper.deleteByInAreaId(areaIdList);
        }


        public List<DeptDO> listByPid(Long pid, String... fieldNames){
            return this.deptMapper.listByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByPid(Long pid, String... fieldNames){
            return this.deptMapper.mapByPid(pid,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPid(Long pid){
            return this.deptMapper.countByPid(pid);
        }

        public Integer updateNotNullFieldsByPid(DeptDO updateDO, Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByPid(updateDO,pid);
        }

        public Integer updateAllFieldsByPid(DeptDO updateDO,  Long pid){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByPid(updateDO,pid);
        }

        public Integer deleteByPid( Long pid){
            return this.deptMapper.deleteByPid(pid);
        }



        public List<DeptDO> listByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInPid(Collection<Long> pidList, String... fieldNames){
            if(CollectionUtils.isEmpty(pidList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInPid(pidList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPid(Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                   return 0;
             }
            return this.deptMapper.countByInPid(pidList);
        }

        public Integer updateNotNullFieldsByInPid(DeptDO updateDO, Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInPid(updateDO,pidList);
        }

        public Integer updateAllFieldsByInPid(DeptDO updateDO,  Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInPid(updateDO,pidList);
        }

        public Integer deleteByInPid( Collection<Long> pidList){
            if(CollectionUtils.isEmpty(pidList)){
                           return 0;
             }
            return this.deptMapper.deleteByInPid(pidList);
        }


        public List<DeptDO> listBySeq(Long seq, String... fieldNames){
            return this.deptMapper.listBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapBySeq(Long seq, String... fieldNames){
            return this.deptMapper.mapBySeq(seq,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySeq(Long seq){
            return this.deptMapper.countBySeq(seq);
        }

        public Integer updateNotNullFieldsBySeq(DeptDO updateDO, Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsBySeq(updateDO,seq);
        }

        public Integer updateAllFieldsBySeq(DeptDO updateDO,  Long seq){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsBySeq(updateDO,seq);
        }

        public Integer deleteBySeq( Long seq){
            return this.deptMapper.deleteBySeq(seq);
        }



        public List<DeptDO> listByInSeq(Collection<Long> seqList, String... fieldNames){
            if(CollectionUtils.isEmpty(seqList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInSeq(Collection<Long> seqList, String... fieldNames){
            if(CollectionUtils.isEmpty(seqList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInSeq(seqList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSeq(Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                   return 0;
             }
            return this.deptMapper.countByInSeq(seqList);
        }

        public Integer updateNotNullFieldsByInSeq(DeptDO updateDO, Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInSeq(updateDO,seqList);
        }

        public Integer updateAllFieldsByInSeq(DeptDO updateDO,  Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInSeq(updateDO,seqList);
        }

        public Integer deleteByInSeq( Collection<Long> seqList){
            if(CollectionUtils.isEmpty(seqList)){
                           return 0;
             }
            return this.deptMapper.deleteByInSeq(seqList);
        }


        public List<DeptDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.deptMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(DeptDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(DeptDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.deptMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<DeptDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.deptMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(DeptDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(DeptDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.deptMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<DeptDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.deptMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(DeptDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(DeptDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.deptMapper.deleteByUserIdModified(userIdModified);
        }



        public List<DeptDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.deptMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.deptMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.deptMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(DeptDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(DeptDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.deptMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

