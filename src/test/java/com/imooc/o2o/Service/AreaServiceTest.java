package com.imooc.o2o.Service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceTest extends BaseTest {

    @Autowired
    AreaService areaService;

    @Test
    public void TestAreaService(){
        List<Area> areaList = areaService.getAreaList();
        for (Area areas:areaList) {
            System.out.print(areas.toString()+"\r\n");
        }
    }
}
