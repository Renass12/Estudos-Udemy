package com.EstudoUdemy.demo.services;

import com.EstudoUdemy.demo.entities.Category;
import com.EstudoUdemy.demo.entities.User;
import com.EstudoUdemy.demo.repositories.CategoryRepository;
import com.EstudoUdemy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
