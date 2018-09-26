package com.wxxcx.demo.dao;

import com.wxxcx.demo.entity.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lz
 * 2018/9/26 14:35
 */
@Mapper
public interface EmpMapper {

    List<EmpVo> queryEmp();
}
