package com.neusoft.service;

import com.neusoft.po.DeliAdd;
import com.neusoft.po.DeliAddExample;

import java.util.List;

public interface DeliAddService {

    List<DeliAdd> selectByuid(Integer uid);
}
