package com.cg.catelogService.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.catelogService.model.Product;
import com.cg.catelogService.model.UserCart;

public interface CatlogRepository extends MongoRepository<UserCart, String> {
	
	
}
