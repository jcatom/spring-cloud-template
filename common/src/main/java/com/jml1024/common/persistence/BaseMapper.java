package com.jml1024.common.persistence;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public interface BaseMapper<T, PK>{
    int insert(T entity);

    int insertSelective(T entity);

    int updateByPrimaryKey(T entity);

    int updateByPrimaryKeySelective(T entity);

    T selectByPrimaryKey(PK primaryKey);

    int deleteByPrimaryKey(PK primaryKey);

    int delete(T entity);

    int batchDeleteByPrimaryKey(Collection<PK> primaryKeys);

    int batchDelete(Collection<T> entitys);
}
