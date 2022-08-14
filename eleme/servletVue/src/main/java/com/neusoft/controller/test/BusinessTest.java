package com.neusoft.controller.test;

import com.neusoft.po.Business;
import com.neusoft.po.Food;
import com.neusoft.service.BusinessService;
import com.neusoft.service.FoodService;
import com.neusoft.service.impl.BusinessServiceImpl;
import com.neusoft.service.impl.FoodServiceImpl;
import org.junit.Test;

import java.util.List;

public class BusinessTest {

    @Test
    public void selectAllTest(){
        BusinessService BS = new BusinessServiceImpl();
        List<Business> res = BS.selectAllBusinesses();
        for(Business item:res)
            System.out.println(item.toString());
    }

    @Test
    public void foodTest(){
        FoodService FS = new FoodServiceImpl();
        List<Food> res = FS.selectFoodsBYbid(2022);
        for(Food item:res)
            System.out.println(item.toString());
    }

    @Test
    public void businesswithfoodTest(){
        BusinessService BS = new BusinessServiceImpl();
        Business res = BS.selectBusinessBYbid(2022);
        System.out.println(res.toString());
    }
}
