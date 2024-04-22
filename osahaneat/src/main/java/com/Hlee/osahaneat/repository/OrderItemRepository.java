package com.Hlee.osahaneat.repository;

import com.Hlee.osahaneat.entity.OrderItem;
import com.Hlee.osahaneat.entity.key.KeyOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, KeyOrderItem> {
}
