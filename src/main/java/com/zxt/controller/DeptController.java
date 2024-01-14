package com.zxt.controller;

import com.zxt.common.Result;
import com.zxt.entity.Dept;
import com.zxt.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("admin/dept")
@Api(tags = "部门管理")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/list")
    @ApiOperation("查询所有部门")
    public Result list(){
        log.info("查询所有部门信息");
        List<Dept> list = deptService.list();
        return Result.success(list);
    }

}
