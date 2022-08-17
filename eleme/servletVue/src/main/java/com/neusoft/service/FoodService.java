package com.neusoft.service;

import com.neusoft.po.Food;
import com.neusoft.po.FoodExample;

import java.util.List;

public interface FoodService {
    List<Food> selectFoodsByBid(Food food);
}
