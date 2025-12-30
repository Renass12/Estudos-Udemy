package com.EstudoUdemy.demo.repositories;

import com.EstudoUdemy.demo.entities.Product;
import com.EstudoUdemy.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
