package com.springweb.service;

import java.util.Optional;

import com.springweb.model.UserEntity;

public interface UserEntityService {

    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByEmail(String email);

    void createNewUserEntity(UserEntity userEntity) ;

}
