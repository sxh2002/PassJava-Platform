package com.wwh.passjava.channel.dao;

import com.wwh.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:20:31
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
