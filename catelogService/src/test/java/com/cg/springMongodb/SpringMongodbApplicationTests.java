package com.cg.springMongodb;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.catelogService.model.UserCart;
import com.cg.catelogService.service.CatlogRepository;

@SpringBootTest
class SpringMongodbApplicationTests {

	@MockBean
	private CatlogRepository repository;
	
	@Test
	public void productAddedTest1() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("1a");
		UserCart usercart = new UserCart("test1@mail.com","test1@mail.com",ar);
		repository.save(usercart);
		assertNotNull(repository.findById("test1@mail.com"));
	}

}
