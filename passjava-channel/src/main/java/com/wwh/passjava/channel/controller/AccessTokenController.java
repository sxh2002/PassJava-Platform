package com.wwh.passjava.channel.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwh.passjava.channel.entity.AccessTokenEntity;
import com.wwh.passjava.channel.service.AccessTokenService;
import com.wwh.common.utils.PageUtils;
import com.wwh.common.utils.R;



/**
 * 渠道-认证表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:20:31
 */
@RestController
@RequestMapping("channel/accesstoken")
public class AccessTokenController {
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("channel:accesstoken:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("channel:accesstoken:info")
    public R info(@PathVariable("id") Long id){
		AccessTokenEntity accessToken = accessTokenService.getById(id);

        return R.ok().put("accessToken", accessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("channel:accesstoken:save")
    public R save(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.save(accessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("channel:accesstoken:update")
    public R update(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.updateById(accessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("channel:accesstoken:delete")
    public R delete(@RequestBody Long[] ids){
		accessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
