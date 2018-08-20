package com.imooc.o2o.Dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        if (areaList.size()>0)
            System.out.print("查询到数据");
        for (int i=0;i<areaList.size();i++){
            System.out.print(areaList.get(i).toString()+"\r\n");
        }

    }
}
