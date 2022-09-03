package com.wwh.passjava.study.dao;

import com.wwh.passjava.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:40:52
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
