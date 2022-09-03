package com.wwh.passjava.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwh.common.utils.PageUtils;
import com.wwh.passjava.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:47:37
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

