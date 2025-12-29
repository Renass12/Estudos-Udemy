package com.EstudoUdemy.demo.services;

import com.EstudoUdemy.demo.entities.Order;
import com.EstudoUdemy.demo.entities.User;
import com.EstudoUdemy.demo.repositories.OrderRepository;
import com.EstudoUdemy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
