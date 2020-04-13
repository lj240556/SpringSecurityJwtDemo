package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Advertisement;
import com.company.project.service.AdvertisementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {
    @Resource
    private AdvertisementService advertisementService;

    @PostMapping
    public Result add(@RequestBody Advertisement advertisement) {
        advertisementService.save(advertisement);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        advertisementService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Advertisement advertisement) {
        advertisementService.update(advertisement);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Advertisement advertisement = advertisementService.findById(id);
        return ResultGenerator.genSuccessResult(advertisement);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Advertisement> list = advertisementService.findAll();
        PageInfo<Advertisement> pageInfo = new PageInfo<Advertisement>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
