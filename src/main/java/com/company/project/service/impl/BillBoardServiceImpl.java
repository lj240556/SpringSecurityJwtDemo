package com.company.project.service.impl;

import com.company.project.dao.BillBoardMapper;
import com.company.project.model.BillBoard;
import com.company.project.service.BillBoardService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/13.
 */
@Service
@Transactional
public class BillBoardServiceImpl extends AbstractService<BillBoard> implements BillBoardService {
    @Resource
    private BillBoardMapper billboardMapper;

}
