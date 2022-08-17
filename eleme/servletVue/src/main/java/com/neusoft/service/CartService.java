package com.neusoft.service;

import com.neusoft.po.Cart;

import java.util.List;

public interface CartService {

    List<Cart> selectCartsBYuid(Integer uid);

    int updateCartByCartId(Cart cart);

    List<Cart> selectCartsBYuidAndbid(Integer uid,Integer bid);

    int deleteByExample(Integer uid,Integer bid);
}
