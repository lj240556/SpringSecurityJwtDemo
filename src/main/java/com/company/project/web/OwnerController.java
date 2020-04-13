package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Owner;
import com.company.project.service.OwnerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Resource
    private OwnerService ownerService;

    @PostMapping
    public Result add(@RequestBody Owner owner) {
        ownerService.save(owner);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        ownerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Owner owner) {
        ownerService.update(owner);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Owner owner = ownerService.findById(id);
        return ResultGenerator.genSuccessResult(owner);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Owner> list = ownerService.findAll();
        PageInfo<Owner> pageInfo = new PageInfo<Owner>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
