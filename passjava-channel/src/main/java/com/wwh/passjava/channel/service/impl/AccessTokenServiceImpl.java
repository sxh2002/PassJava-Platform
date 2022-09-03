package com.wwh.passjava.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwh.common.utils.PageUtils;
import com.wwh.common.utils.Query;

import com.wwh.passjava.channel.dao.AccessTokenDao;
import com.wwh.passjava.channel.entity.AccessTokenEntity;
import com.wwh.passjava.channel.service.AccessTokenService;


@Service("accessTokenService")
public class AccessTokenServiceImpl extends ServiceImpl<AccessTokenDao, AccessTokenEntity> implements AccessTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AccessTokenEntity> page = this.page(
                new Query<AccessTokenEntity>().getPage(params),
                new QueryWrapper<AccessTokenEntity>()
        );

        return new PageUtils(page);
    }

}