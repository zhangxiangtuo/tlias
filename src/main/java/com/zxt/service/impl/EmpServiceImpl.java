package com.zxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxt.entity.Emp;
import com.zxt.service.EmpService;
import com.zxt.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【emp(员工表)】的数据库操作Service实现
* @createDate 2024-01-14 15:39:57
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




