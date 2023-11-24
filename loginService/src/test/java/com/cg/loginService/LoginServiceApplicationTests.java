package com.cg.loginService;

import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.offset;
import static org.junit.Assert.assertNotNull;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.loginService.controller.LoginController;
import com.cg.loginService.model.User;
import com.cg.loginService.repository.LoginRepository;
import com.mongodb.connection.Stream;

import org.springframework.boot.test.mock.mockito.MockBean;

//@RunWith(SpringRunner.class)
@SpringBootTest
class LoginServiceApplicationTests {

	
	@Autowired
	private LoginController service;
	
	@MockBean
	private LoginRepository repository;
	
//	@Test
//	public void loginUserTest() {
//		when(repository.findAll().thenReturn(Stream
//				.of(new User("user1@mail.com","user1Fname","user1Lname",
//						"user1","1898-02-01","male")).collect(Collectors.toList())));
//		assertEquals(1,service.loginUser().size());
//	}
	
	@Test
	public void userRegistrationTest1() {
		User usr = new User("test1@mail.com","test1Fname","test1Lname",
				"test1","1989-12-10","male");
//		usr.setEmail("test@mail.com");
//		usr.setDob("1989-12-10");
//		usr.setFname("testFname");
//		usr.setLname("testLname");
//		usr.setGender("male");
//		usr.setPasswd("test");
		repository.save(usr);
		assertNotNull(repository.findById("test1@mail.com"));
	}
	@Test
	public void userRegistrationTest2() {
		User usr = new User("test2@mail.com","test2Fname","test2Lname",
				"test2","1989-12-10","male");
//		usr.setEmail("test@mail.com");
//		usr.setDob("1989-12-10");
//		usr.setFname("testFname");
//		usr.setLname("testLname");
//		usr.setGender("male");
//		usr.setPasswd("test");
		repository.save(usr);
		assertNotNull(repository.findById("test2@mail.com"));
	}
	
	@Test
	public void loginUserTest1() {
		User usr = new User("test1@mail.com","test1Fname","test1Lname",
				"test1","1989-12-10","male");
		repository.save(usr);
		assertNotNull(repository.findById("test1@mail.com"));
	}
	
	@Test
	public void loginUserTest2() {
		User usr = new User("test2@mail.com","test2Fname","test2Lname",
				"test2","1989-12-10","male");
		repository.save(usr);
		assertNotNull(repository.findById("test2@mail.com"));
	}
}
