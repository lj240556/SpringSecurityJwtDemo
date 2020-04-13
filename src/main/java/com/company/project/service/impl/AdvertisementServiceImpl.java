package com.company.project.service.impl;

import com.company.project.dao.AdvertisementMapper;
import com.company.project.model.Advertisement;
import com.company.project.service.AdvertisementService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class AdvertisementServiceImpl extends AbstractService<Advertisement> implements AdvertisementService {
    @Resource
    private AdvertisementMapper advertisementMapper;

}
