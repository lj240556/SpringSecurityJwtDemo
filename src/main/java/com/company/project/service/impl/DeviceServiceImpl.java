package com.company.project.service.impl;

import com.company.project.dao.DeviceMapper;
import com.company.project.model.Device;
import com.company.project.service.DeviceService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class DeviceServiceImpl extends AbstractService<Device> implements DeviceService {
    @Resource
    private DeviceMapper deviceMapper;

}
