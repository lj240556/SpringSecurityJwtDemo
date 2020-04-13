package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Industry;
import com.company.project.service.IndustryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/industry")
public class IndustryController {
    @Resource
    private IndustryService industryService;

    @PostMapping
    public Result add(@RequestBody Industry industry) {
        industryService.save(industry);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        industryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Industry industry) {
        industryService.update(industry);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Industry industry = industryService.findById(id);
        return ResultGenerator.genSuccessResult(industry);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Industry> list = industryService.findAll();
        PageInfo<Industry> pageInfo = new PageInfo<Industry>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
