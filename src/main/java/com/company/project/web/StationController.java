package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Station;
import com.company.project.service.StationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/station")
public class StationController {
    @Resource
    private StationService stationService;

    @PostMapping
    public Result add(@RequestBody Station station) {
        stationService.save(station);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        stationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Station station) {
        stationService.update(station);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Station station = stationService.findById(id);
        return ResultGenerator.genSuccessResult(station);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Station> list = stationService.findAll();
        PageInfo<Station> pageInfo = new PageInfo<Station>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
