package com.zxt.controller;

import com.zxt.service.EmpService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/emp")
@Slf4j
@Api(tags = "员工管理")
public class EmpController {

    @Autowired
    private EmpService empService;




}
