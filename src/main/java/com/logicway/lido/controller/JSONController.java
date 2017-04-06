package com.logicway.lido.controller;

import com.logicway.lido.model.UserOrder;
import com.logicway.lido.service.UserOrdeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by a.bukov on 05.04.2017.
 */
@RestController
public class JSONController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private EntityManagerFactory managerFactory;

    @Autowired
    private UserOrdeService userOrdeService;

    @GetMapping("/order/{item}")
    public @ResponseBody
    UserOrder getShopInJSON(@PathVariable String item) throws SQLException {

        EntityManager em = managerFactory.createEntityManager();
        UserOrder userOrder = new UserOrder();
        userOrder.setItems(item);
        userOrdeService.addUserOrder(userOrder);
        return userOrder;

    }

}
