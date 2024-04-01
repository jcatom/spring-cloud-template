package com.jml1024.common.service.impl;

import com.jml1024.common.service.IBaseService;
import com.jml1024.common.persistence.BaseMapper;

import java.util.List;

public class BaseServiceImpl<T, PK> implements IBaseService<T, PK> {

    private BaseMapper mapper;

    public BaseServiceImpl(BaseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int insertSelective(T entity) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(T entity) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return 0;
    }

    @Override
    public T selectByPrimaryKey(PK primaryKey) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(PK primaryKey) {
        return 0;
    }

    @Override
    public int delete(T entity) {
        return 0;
    }

    @Override
    public int batchDeleteByPrimaryKey(List<PK> primaryKeys) {
        return 0;
    }

    @Override
    public int batchDelete(List<T> entities) {
        return 0;
    }
}
