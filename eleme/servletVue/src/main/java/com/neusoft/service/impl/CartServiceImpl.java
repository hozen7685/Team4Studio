package com.neusoft.service.impl;

import com.neusoft.dao.CartMapper;
import com.neusoft.po.Cart;
import com.neusoft.po.CartExample;
import com.neusoft.service.CartService;
import com.neusoft.utils.service.UTS;

import java.util.List;

public class CartServiceImpl implements CartService {

    CartMapper cartMapper = UTS.getSession().getMapper(CartMapper.class);

    @Override
    public List<Cart> selectCartsBYuid(Integer uid) {
        return cartMapper.selectCartsBYuid(uid);
    }

    @Override
    public int updateCartByCartId(Cart cart) {
        return cartMapper.updateByPrimaryKey(cart);
    }

    @Override
    public List<Cart> selectCartsBYuidAndbid(Integer uid, Integer bid) {
        return cartMapper.selectCartsBYbidAnduid(uid,bid);
    }

    @Override
    public int deleteByExample(Integer uid,Integer bid) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andBidEqualTo(bid).andUidEqualTo(uid);
        return cartMapper.deleteByExample(cartExample);
    }

}
