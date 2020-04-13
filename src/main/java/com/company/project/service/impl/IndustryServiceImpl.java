package com.company.project.service.impl;

import com.company.project.dao.IndustryMapper;
import com.company.project.model.Industry;
import com.company.project.service.IndustryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class IndustryServiceImpl extends AbstractService<Industry> implements IndustryService {
    @Resource
    private IndustryMapper industryMapper;

}
