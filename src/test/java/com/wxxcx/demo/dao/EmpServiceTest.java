package com.wxxcx.demo.dao;

import com.wxxcx.demo.entity.Area;
import com.wxxcx.demo.entity.EmpVo;
import com.wxxcx.demo.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpServiceTest {
    @Autowired
    private EmpService empService;

    @Test
    public void querArea() throws Exception {
        List<EmpVo> areaList = empService.queryEmp();
        assertEquals(10,areaList.size());
    }

//    @Test
//    public void querAreaById() throws Exception {
//    }
//
//    @Test
//    public void insertArea() throws Exception {
//    }
//
//    @Test
//    public void updateArea() throws Exception {
//    }
//
//    @Test
//    public void deleteArea() throws Exception {
//    }

}