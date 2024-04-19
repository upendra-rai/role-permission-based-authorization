package com.upendra.rai.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.upendra.rai.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
