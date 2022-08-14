package com.neusoft.service;

import com.neusoft.po.Business;

import java.util.List;

public interface BusinessService {
    List<Business> selectAllBusinesses();

    Business selectBusinessBYbid(Integer bid);
}
