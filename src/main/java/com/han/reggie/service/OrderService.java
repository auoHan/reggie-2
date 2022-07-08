package com.han.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.han.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     *
     * @param orders
     */
    void submit(Orders orders);
}
