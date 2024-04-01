package com.jml1024.common.service;

import java.util.List;

public interface IBaseService <T, PK> {

    /**
     * 新增记录
     * @param entity
     * @return 新增记录数量
     */
    int insert(T entity);

    /**
     * 新增记录（插入部分字段）
     * @param entity
     * @return 新增记录数量
     */
    int insertSelective(T entity);

    /**
     * 更新记录
     * @param entity
     * @return 更新记录数量
     */
    int updateByPrimaryKey(T entity);

    /**
     * 更新记录（部分更行）
     * @param t
     * @return 更新记录数量
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 根据主键查询记录
     * @param primaryKey
     * @return 记录实体对象
     */
    T selectByPrimaryKey(PK primaryKey);

    /**
     * 根据主键删除记录
     * @param primaryKey
     * @return 记录删除数量
     */
    int deleteByPrimaryKey(PK primaryKey);

    /**
     * 根据实体对象删除记录
     * @param entity
     * @return 记录删除数量
     */
    int delete(T entity);

    /**
     * 根据主键列表批量删除记录
     *
     * @param primaryKeys 主键列表
     * @return 记录删除数量
     */
    int batchDeleteByPrimaryKey(List<PK> primaryKeys);

    /**
     * 根据实体对象列表批量删除记录
     *
     * @param entities 实体对象列表
     * @return 记录删除数量
     */
    int batchDelete(List<T> entities);
}
