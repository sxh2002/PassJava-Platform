package com.wwh.passjava.content.dao;

import com.wwh.passjava.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:31:31
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
