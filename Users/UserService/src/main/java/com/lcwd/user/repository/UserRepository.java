package com.lcwd.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.entity.UserEntity;

public interface UserRepository extends JpaRepository <UserEntity, String>{

}
