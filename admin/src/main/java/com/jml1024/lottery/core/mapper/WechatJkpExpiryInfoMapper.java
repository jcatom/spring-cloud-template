package com.jml1024.lottery.core.mapper;

import com.jml1024.lottery.core.entity.WechatJkpExpiryInfo;
import com.jml1024.lottery.core.entity.WechatJkpExpiryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatJkpExpiryInfoMapper {
    long countByExample(WechatJkpExpiryInfoExample example);

    int deleteByExample(WechatJkpExpiryInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WechatJkpExpiryInfo row);

    int insertSelective(WechatJkpExpiryInfo row);

    List<WechatJkpExpiryInfo> selectByExample(WechatJkpExpiryInfoExample example);

    WechatJkpExpiryInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") WechatJkpExpiryInfo row, @Param("example") WechatJkpExpiryInfoExample example);

    int updateByExample(@Param("row") WechatJkpExpiryInfo row, @Param("example") WechatJkpExpiryInfoExample example);

    int updateByPrimaryKeySelective(WechatJkpExpiryInfo row);

    int updateByPrimaryKey(WechatJkpExpiryInfo row);
}