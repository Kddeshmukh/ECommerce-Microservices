package com.ecommerce.user_auth_service.repository;

import com.ecommerce.user_auth_service.entity.User;
import com.ecommerce.user_auth_service.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User>findByEmail(String email);
}
