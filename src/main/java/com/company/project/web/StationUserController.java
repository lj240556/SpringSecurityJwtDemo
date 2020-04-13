package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.StationUser;
import com.company.project.service.StationUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/station/user")
public class StationUserController {
    @Resource
    private StationUserService stationUserService;

    @PostMapping
    public Result add(@RequestBody StationUser stationUser) {
        stationUserService.save(stationUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        stationUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody StationUser stationUser) {
        stationUserService.update(stationUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        StationUser stationUser = stationUserService.findById(id);
        return ResultGenerator.genSuccessResult(stationUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<StationUser> list = stationUserService.findAll();
        PageInfo<StationUser> pageInfo = new PageInfo<StationUser>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
