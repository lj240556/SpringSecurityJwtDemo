package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BillBoard;
import com.company.project.service.BillBoardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/13.
*/
@RestController
@RequestMapping("/bill/board")
public class BillBoardController {
    @Resource
    private BillBoardService billBoardService;

    @PostMapping
    public Result add(@RequestBody BillBoard billBoard) {
        billBoardService.save(billBoard);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        billBoardService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody BillBoard billBoard) {
        billBoardService.update(billBoard);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        BillBoard billBoard = billBoardService.findById(id);
        return ResultGenerator.genSuccessResult(billBoard);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<BillBoard> list = billBoardService.findAll();
        PageInfo<BillBoard> pageInfo = new PageInfo<BillBoard>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
