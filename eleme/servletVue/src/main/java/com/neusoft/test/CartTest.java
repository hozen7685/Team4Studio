package com.neusoft.test;

import com.neusoft.po.Cart;
import com.neusoft.service.CartService;
import com.neusoft.service.impl.CartServiceImpl;
import org.junit.Test;

import java.util.List;

public class CartTest {

    @Test
    public void carttest(){
        CartService CS = new CartServiceImpl();
        List<Cart> res = CS.selectCartsBYuid(114514);
        for (Cart item:res)
            System.out.println(item.toString());
    }

    @Test
    public void updateCart(){
        CartService CS = new CartServiceImpl();
        Cart cart = new Cart(1,1,2022,2);
        int res = CS.updateCartByCartId(cart);
        System.out.println(res);
    }

    @Test
    public void carttest2(){
        CartService CS = new CartServiceImpl();
        List<Cart> res = CS.selectCartsBYuidAndbid(114514,7899);
        for (Cart item:res)
            System.out.println(item.toString());
    }
}
