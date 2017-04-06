package com.logicway.lido.service;

import com.logicway.lido.model.UserOrder;
import com.logicway.lido.repository.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by a.bukov on 05.04.2017.
 */
@Service
@Transactional
public class UserOrdeServiceImpl implements UserOrdeService {
    @Autowired
    private UserOrderRepository userOrderRepository;

    @Override
    public UserOrder addUserOrder(UserOrder order) {
        return userOrderRepository.saveAndFlush(order);
    }

    @Override
    public void delete(long id) {
        userOrderRepository.delete(id);
    }

    @Override
    public UserOrder getByItems(String name) {
        return userOrderRepository.findByItems(name);
    }

    @Override
    public UserOrder editUserOrder(UserOrder bank) {
        return userOrderRepository.saveAndFlush(bank);
    }

    @Override
    public List<UserOrder> getAll() {
        return userOrderRepository.findAll();
    }
}
