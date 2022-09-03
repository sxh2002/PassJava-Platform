package com.wwh.passjava.question.dao;

import com.wwh.passjava.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 13:56:34
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
