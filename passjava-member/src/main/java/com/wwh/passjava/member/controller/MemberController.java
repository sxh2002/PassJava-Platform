package com.wwh.passjava.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.wwh.passjava.member.feign.StudyTimeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwh.passjava.member.entity.MemberEntity;
import com.wwh.passjava.member.service.MemberService;
import com.wwh.common.utils.PageUtils;
import com.wwh.common.utils.R;



/**
 * 会员-会员表
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 15:47:37
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    StudyTimeFeignService studyTimeFeignService;


    /**
     * 测试openFeign
     * @param id
     * @return
     */
    @RequestMapping("/studytime/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id) {
        //mock数据库查到的会员信息
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(id); // 学习时长：100分钟
        memberEntity.setNickname("吴文浩学JAVA");

        //远程调用拿到该用户的学习时长（学习时长是mock数据）
        R memberStudyTimeList = studyTimeFeignService.getMemberStudyTimeListTest(id);
        return R.ok().put("member", memberEntity).put("studytime", memberStudyTimeList.get("studytime"));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
