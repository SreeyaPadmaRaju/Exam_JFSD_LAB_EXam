package com.klef.jfsd.repository;

import com.klef.jfsd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
