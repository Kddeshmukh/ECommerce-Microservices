package com.ecommerce.user_auth_service.repository;

import com.ecommerce.user_auth_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAddressRepository extends JpaRepository<User, UUID> {
}
