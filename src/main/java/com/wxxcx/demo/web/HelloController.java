package com.wxxcx.demo.web;

import com.wxxcx.demo.entity.EmpVo;
import com.wxxcx.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/test")
    public void test(){
        System.out.println("areaList: ");
    }

    @RequestMapping("/queryEmp")
    public void queryEmp(){
        List<EmpVo> empVos = empService.queryEmp();
        for (EmpVo empVo : empVos){
            System.out.println(empVo.geteId() + "---->>" + empVo.geteName());
        }
    }
}
