package com.jml1024.common.service.impl;

import com.jml1024.common.service.IBaseService;
import com.jml1024.common.persistence.BaseMapper;

import java.util.Collection;
import java.util.List;

public class BaseServiceImpl<T, PK> implements IBaseService<T, PK> {

    private BaseMapper<T, PK> mapper;

    public BaseServiceImpl(BaseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int updateByPrimaryKey(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public T selectByPrimaryKey(PK primaryKey) {
        return mapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public int deleteByPrimaryKey(PK primaryKey) {
        return mapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public int delete(T entity) {
        return mapper.delete(entity);
    }

    @Override
    public int batchDeleteByPrimaryKey(Collection<PK> primaryKeys) {
        return mapper.batchDeleteByPrimaryKey(primaryKeys);
    }

    @Override
    public int batchDelete(Collection<T> entities) {
        return mapper.batchDelete(entities);
    }
}
