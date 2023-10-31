package com.jml1024.gen.mapper;

import com.jml1024.gen.entity.SysDataSource;
import com.jml1024.gen.entity.SysDataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDataSourceMapper {
    long countByExample(SysDataSourceExample example);

    int deleteByExample(SysDataSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysDataSource row);

    int insertSelective(SysDataSource row);

    List<SysDataSource> selectByExample(SysDataSourceExample example);

    SysDataSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") SysDataSource row, @Param("example") SysDataSourceExample example);

    int updateByExample(@Param("row") SysDataSource row, @Param("example") SysDataSourceExample example);

    int updateByPrimaryKeySelective(SysDataSource row);

    int updateByPrimaryKey(SysDataSource row);
}