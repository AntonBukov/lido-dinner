package com.logicway.lido.service;

import com.logicway.lido.model.UserOrder;

import java.util.List;

/**
 * Created by a.bukov on 05.04.2017.
 */
public interface UserOrdeService {

    UserOrder addUserOrder(UserOrder order);
    void delete(long id);
    UserOrder getByItems(String title);
    UserOrder editUserOrder(UserOrder bank);
    List<UserOrder> getAll();

}