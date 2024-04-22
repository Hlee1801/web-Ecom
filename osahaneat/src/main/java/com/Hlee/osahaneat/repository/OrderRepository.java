package com.Hlee.osahaneat.repository;

import com.Hlee.osahaneat.entity.Orders;
import com.Hlee.osahaneat.entity.key.KeyOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public interface OrderRepository extends JpaRepository<Orders, KeyOrderItem> {
}
