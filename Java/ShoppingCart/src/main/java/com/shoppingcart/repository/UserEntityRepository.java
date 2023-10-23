package com.shoppingcart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.model.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	Optional<UserEntity> findByEmail(String email);
	
	Optional<UserEntity> findByUserName(String userName);
}
