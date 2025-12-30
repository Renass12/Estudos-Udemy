package com.EstudoUdemy.demo.services;

import com.EstudoUdemy.demo.entities.Product;
import com.EstudoUdemy.demo.entities.User;
import com.EstudoUdemy.demo.repositories.ProductRepository;
import com.EstudoUdemy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
