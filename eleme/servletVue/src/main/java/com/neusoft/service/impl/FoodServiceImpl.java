package com.neusoft.service.impl;

import com.neusoft.dao.FoodMapper;
import com.neusoft.po.Food;
import com.neusoft.po.FoodExample;
import com.neusoft.service.FoodService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class FoodServiceImpl implements FoodService {

    FoodMapper foodMapper = UTS.getSession().getMapper(FoodMapper.class);

    @Override
    public List<Food> selectFoodsByBid(Food food) {

        FoodExample foodExample = new FoodExample();
        FoodExample.Criteria criteria = foodExample.createCriteria();
        criteria.andBidEqualTo(food.getBid());

        return foodMapper.selectByExampleWithBLOBs(foodExample);
    }
}
