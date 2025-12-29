package com.EstudoUdemy.demo.repositories;

import com.EstudoUdemy.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
