package com.cg.springMongodb;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.cartService.model.UserCart;
import com.cg.cartService.resource.CartController;
import com.cg.cartService.service.CartRepository;
import com.netflix.discovery.shared.Application;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;



//@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
class SpringMongodbApplicationTests {

	@Autowired
	private CartController service;
	
	@MockBean
	private CartRepository repository;
	
	@Test
	public void adminPageTest() {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("1a");
		UserCart usercart = new UserCart("test1@mail.com","test1@mail.com",ar);
		repository.save(usercart);
		assertNotNull(repository.findById("test1@mail.com"));

	}

}
