package com.company.project.service.impl;

import com.company.project.dao.ObjTypeMapper;
import com.company.project.model.ObjType;
import com.company.project.service.ObjTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class ObjTypeServiceImpl extends AbstractService<ObjType> implements ObjTypeService {
    @Resource
    private ObjTypeMapper objtypeMapper;

}
