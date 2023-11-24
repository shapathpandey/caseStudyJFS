package com.cg.cartService.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.cartService.model.Product;
import com.cg.cartService.model.UserCart;

public interface CartRepository extends MongoRepository<UserCart, String> {
	
	
}
