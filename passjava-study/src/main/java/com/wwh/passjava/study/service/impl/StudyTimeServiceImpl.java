package com.wwh.passjava.study.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwh.common.utils.PageUtils;
import com.wwh.common.utils.Query;

import com.wwh.passjava.study.dao.StudyTimeDao;
import com.wwh.passjava.study.entity.StudyTimeEntity;
import com.wwh.passjava.study.service.StudyTimeService;


@Service("studyTimeService")
public class StudyTimeServiceImpl extends ServiceImpl<StudyTimeDao, StudyTimeEntity> implements StudyTimeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StudyTimeEntity> page = this.page(
                new Query<StudyTimeEntity>().getPage(params),
                new QueryWrapper<StudyTimeEntity>()
        );

        return new PageUtils(page);
    }

}