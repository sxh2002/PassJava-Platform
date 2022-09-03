package com.wwh.passjava.member.dao;

import com.wwh.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:47:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
