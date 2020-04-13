package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Device;
import com.company.project.service.DeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/device")
public class DeviceController {
    @Resource
    private DeviceService deviceService;

    @PostMapping
    public Result add(@RequestBody Device device) {
        deviceService.save(device);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        deviceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Device device) {
        deviceService.update(device);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Device device = deviceService.findById(id);
        return ResultGenerator.genSuccessResult(device);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Device> list = deviceService.findAll();
        PageInfo<Device> pageInfo = new PageInfo<Device>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
