package com.logicway.lido.repository;

import com.logicway.lido.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by a.bukov on 05.04.2017.
 */
@Transactional
public interface UserOrderRepository extends JpaRepository<UserOrder, Long> {
    @Query("select b from UserOrder b where b.items = :items")
    UserOrder findByItems(@Param("items") String items);
}
