package com.EstudoUdemy.demo.repositories;

import com.EstudoUdemy.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
