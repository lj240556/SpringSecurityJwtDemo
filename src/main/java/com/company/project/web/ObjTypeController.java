package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ObjType;
import com.company.project.service.ObjTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/obj/type")
public class ObjTypeController {
    @Resource
    private ObjTypeService objTypeService;

    @PostMapping
    public Result add(@RequestBody ObjType objType) {
        objTypeService.save(objType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        objTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ObjType objType) {
        objTypeService.update(objType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ObjType objType = objTypeService.findById(id);
        return ResultGenerator.genSuccessResult(objType);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<ObjType> list = objTypeService.findAll();
        PageInfo<ObjType> pageInfo = new PageInfo<ObjType>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
