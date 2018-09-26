package com.wxxcx.demo.service;

import com.wxxcx.demo.dao.EmpMapper;
import com.wxxcx.demo.entity.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lz
 * 2018/9/26 14:41
 */
@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    public List<EmpVo> queryEmp(){
        return empMapper.queryEmp();
    }
}
