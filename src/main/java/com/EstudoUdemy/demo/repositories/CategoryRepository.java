package com.EstudoUdemy.demo.repositories;

import com.EstudoUdemy.demo.entities.Category;
import com.EstudoUdemy.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
