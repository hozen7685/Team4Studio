package com.neusoft.service;

import com.neusoft.po.Cart;

import java.util.List;

public interface CartService {

    List<Cart> selectCartsBYuid(String uid);

    int updateCartByCartId(Cart cart);

    List<Cart> selectCartsBYuidAndbid(String uid,Integer bid);
}
