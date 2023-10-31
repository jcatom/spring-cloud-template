package com.jml1024.gen.mapper;

import com.jml1024.gen.entity.ScheduleJob;
import com.jml1024.gen.entity.ScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobMapper {
    long countByExample(ScheduleJobExample example);

    int deleteByExample(ScheduleJobExample example);

    int insert(ScheduleJob row);

    int insertSelective(ScheduleJob row);

    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    int updateByExampleSelective(@Param("row") ScheduleJob row, @Param("example") ScheduleJobExample example);

    int updateByExample(@Param("row") ScheduleJob row, @Param("example") ScheduleJobExample example);
}