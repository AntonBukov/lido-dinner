package com.logicway.lido.controller;

import com.logicway.lido.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a.bukov on 05.04.2017.
 */
@RestController
public class JSONController {

    @GetMapping("/order/{name}")
    public @ResponseBody
    Order getShopInJSON(@PathVariable String name) {

        Order order = new Order();
        order.setUserName(name);
        order.setStaffName(new String[]{"катлета", "макароны"});

        return order;

    }

}
