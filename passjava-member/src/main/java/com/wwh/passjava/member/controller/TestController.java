package com.wwh.passjava.member.controller;

import com.wwh.common.utils.R;
import com.wwh.passjava.member.feign.StudyTimeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("member/test")
@RefreshScope
public class TestController {

    @Autowired
    StudyTimeFeignService studyTimeFeignService;

    @Value("${member.age}")
    private  String age;

    @Value("${member.nick}")
    private  String nickname;


    @RequestMapping("/test-refreshscope-config")
    public R testLocalConfig() {
        return R.ok().put("nickname", nickname).put("age", age);
    }

//    @RequestMapping("/studytime/test")
//    public R testOpenFeign(){
//        return studyTimeFeignService.getMemberStudyTimeListTest();
//    }
}
