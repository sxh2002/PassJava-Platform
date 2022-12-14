package com.wwh.passjava.study.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwh.passjava.study.entity.ViewLogEntity;
import com.wwh.passjava.study.service.ViewLogService;
import com.wwh.common.utils.PageUtils;
import com.wwh.common.utils.R;



/**
 * 学习-用户学习浏览记录表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:40:52
 */
@RestController
@RequestMapping("study/viewlog")
public class ViewLogController {
    @Autowired
    private ViewLogService viewLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("study:viewlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = viewLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("study:viewlog:info")
    public R info(@PathVariable("id") Long id){
		ViewLogEntity viewLog = viewLogService.getById(id);

        return R.ok().put("viewLog", viewLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("study:viewlog:save")
    public R save(@RequestBody ViewLogEntity viewLog){
		viewLogService.save(viewLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("study:viewlog:update")
    public R update(@RequestBody ViewLogEntity viewLog){
		viewLogService.updateById(viewLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("study:viewlog:delete")
    public R delete(@RequestBody Long[] ids){
		viewLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
