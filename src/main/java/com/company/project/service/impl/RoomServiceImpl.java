package com.company.project.service.impl;

import com.company.project.dao.RoomMapper;
import com.company.project.model.Room;
import com.company.project.service.RoomService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class RoomServiceImpl extends AbstractService<Room> implements RoomService {
    @Resource
    private RoomMapper roomMapper;

}
