package com.wwh.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwh.common.utils.PageUtils;
import com.wwh.passjava.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:31:31
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

