package com.zorojuro.book_network.role;

import com.zorojuro.book_network.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<User> findByEmail(String email);
}
