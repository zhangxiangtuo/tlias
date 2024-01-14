package com.zxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxt.entity.Dept;
import com.zxt.service.DeptService;
import com.zxt.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【dept(部门表)】的数据库操作Service实现
* @createDate 2024-01-14 15:39:57
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




