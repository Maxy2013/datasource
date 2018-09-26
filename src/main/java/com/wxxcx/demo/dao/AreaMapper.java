package com.wxxcx.demo.dao;

import com.wxxcx.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaMapper {
    List<Area> querArea();
    Area querAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
