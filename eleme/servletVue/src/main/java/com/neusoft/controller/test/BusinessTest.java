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
    public void foodTest(){
        Food food = new Food();
        food.setBid(7899);

        FoodService FS = new FoodServiceImpl();
        List<Food> res = FS.selectFoodsByBid(food);
        for(Food item:res)
            System.out.println(item.toString());
    }
}
