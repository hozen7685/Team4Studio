package com.neusoft.service;

import com.neusoft.po.Orderdetail;

public interface OrderdetailService {
    Orderdetail selectOrderdetailetByOdid(Integer odid);
}
