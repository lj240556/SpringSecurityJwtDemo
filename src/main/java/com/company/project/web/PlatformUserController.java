package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PlatformUser;
import com.company.project.service.PlatformUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/platform/user")
public class PlatformUserController {
    @Resource
    private PlatformUserService platformUserService;

    @PostMapping
    public Result add(@RequestBody PlatformUser platformUser) {
        platformUserService.save(platformUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        platformUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody PlatformUser platformUser) {
        platformUserService.update(platformUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        PlatformUser platformUser = platformUserService.findById(id);
        return ResultGenerator.genSuccessResult(platformUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<PlatformUser> list = platformUserService.findAll();
        PageInfo<PlatformUser> pageInfo = new PageInfo<PlatformUser>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
