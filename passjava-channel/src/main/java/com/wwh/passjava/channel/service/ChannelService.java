package com.wwh.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwh.common.utils.PageUtils;
import com.wwh.passjava.channel.entity.ChannelEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:20:31
 */
public interface ChannelService extends IService<ChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

