package com.lzw.common.dao.manager;

/**
 * @author liys
 * @date 2018/3/1416:14
 */
public interface DOChecker {


    public static final DOChecker DEFAULT_CHECKER=new DOChecker() {
        @Override
        public void checkWhenAdd(Object dbo) {

        }

        @Override
        public void checkWhenModify(Object dbo) {

        }

        @Override
        public void checkWhenRemove(Object id) {

        }
    };


    /**
     * {@link com.hyzs.gz.common.dao.service.DOService#insert(Object)}调用
     * @param dbo
     */
    public void checkWhenAdd(Object dbo);

    /**
     * {@link com.hyzs.gz.common.dao.service.DOService#updateById(Object)}调用
     * @param dbo
     */
    public void checkWhenModify(Object dbo);


    /**
     * {@link com.hyzs.gz.common.dao.service.DOService#deleteById(Object)}调用
     * @param id
     */
    public void checkWhenRemove(Object id);
}
