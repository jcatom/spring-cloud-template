package com.jml1024.core.persistence;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public interface BaseMapper<D, K>{
    int insert(D entity);
//
//    int insertSelective(D entity);
//
//    int updateByPrimaryKey(D entity);
//
//    int updateByPrimaryKeySelective(D entity);
//
//    D selectByPrimaryKey(K id);
//
//    int deleteByPrimaryKey(K id);
//
//    int delete(D entity);
//
//    int batchDeleteByPrimaryKey(Collection<K> ids);
//
//    int batchDelete(Collection<D> entitys);
//
//    int getCountBy(Object query);
//
//    List<D> getListBy(Object query);
}
