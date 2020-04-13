package com.company.project.service.impl;

import com.company.project.dao.OwnerMapper;
import com.company.project.model.Owner;
import com.company.project.service.OwnerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class OwnerServiceImpl extends AbstractService<Owner> implements OwnerService {
    @Resource
    private OwnerMapper ownerMapper;

}
