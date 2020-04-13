package com.company.project.service.impl;

import com.company.project.dao.StationUserMapper;
import com.company.project.model.StationUser;
import com.company.project.service.StationUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class StationUserServiceImpl extends AbstractService<StationUser> implements StationUserService {
    @Resource
    private StationUserMapper suserMapper;

}
