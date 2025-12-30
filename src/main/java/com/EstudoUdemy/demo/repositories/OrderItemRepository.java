package com.EstudoUdemy.demo.repositories;

import com.EstudoUdemy.demo.entities.OrderItem;
import com.EstudoUdemy.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
