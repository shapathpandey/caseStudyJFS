package com.cg.loginService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.loginService.model.User;

public interface LoginRepository extends MongoRepository<User, String> {

}
