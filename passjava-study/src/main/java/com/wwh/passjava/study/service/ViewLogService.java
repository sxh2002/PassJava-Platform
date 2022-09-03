package com.wwh.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwh.common.utils.PageUtils;
import com.wwh.passjava.study.entity.ViewLogEntity;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:40:52
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

