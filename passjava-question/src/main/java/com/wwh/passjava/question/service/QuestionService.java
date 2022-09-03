package com.wwh.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwh.common.utils.PageUtils;
import com.wwh.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author wwh
 * @email wwh@qq.com
 * @date 2022-09-03 13:56:34
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

