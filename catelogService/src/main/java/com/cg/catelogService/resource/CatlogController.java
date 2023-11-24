package com.cg.catelogService.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.json.JSONArray;
import org.json.JSONObject;

import com.cg.catelogService.model.Product;
import com.cg.catelogService.model.UserCart;
import com.cg.catelogService.service.CatlogRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Controller
@RequestMapping("/catlog")
public class CatlogController {
	
	@Autowired
	private CatlogRepository repository;
	
	@Autowired
    private RestTemplate restTemplate;
	

	
	@GetMapping("/usr/catlog")
	public ModelAndView showCatlog(@ModelAttribute Product product1) {
		product1.setId("12");
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("shop");        
		modelAndView.addObject("product1", new Product());      
		return modelAndView;    
	}
	
	@GetMapping("/usr/cart")
	public String productAdded(Model model) {
		List<UserCart> userCartList = repository.findAll();
		for (UserCart usr:userCartList) {
			if(usr.getEmail().equals("user2@mail.com")) {
				ArrayList<String> ar = usr.getAr();
				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
				repository.save(usrcart);
			}
		}
		model.addAttribute("carts",userCartList);
		return "catlog";
	}
	
	@PostMapping("/usr/clearCart")
	public String clearCart() {
		repository.deleteById("user2@mail.com");
		return "cartCleared";
	}
	
	
	
	@PostMapping("/usr/productAdded1a")
	public String addProduct1a(Model model) {	
		int flag = 0;
		List<UserCart> userCartList = repository.findAll();
		for (UserCart usr:userCartList) {
			if(usr.getEmail().equals("user2@mail.com")) {
				ArrayList<String> ar = usr.getAr();
				ar.add("1a");
				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
				repository.save(usrcart);
				flag=1;
			}
		}
		if(flag==0){
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("1a");
			UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
			repository.save(usrcart);
		}
		List<UserCart> updatedUserCartList = repository.findAll();
		model.addAttribute("carts",updatedUserCartList);
		return "catlog";
	}
	
	@PostMapping("/usr/productAdded2b")
	public String addProduct2b(Model model) {
		int flag = 0;
		List<UserCart> userCartList = repository.findAll();
		for (UserCart usr:userCartList) {
			if(usr.getEmail().equals("user2@mail.com")) {
				ArrayList<String> ar = usr.getAr();
				ar.add("2b");
				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
				repository.save(usrcart);
				flag=1;
			}
		}
		if(flag==0){
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("2b");
			UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
			repository.save(usrcart);
		}
		List<UserCart> updatedUserCartList = repository.findAll();
		model.addAttribute("carts",updatedUserCartList);
		return "catlog";
	}
	
	@PostMapping("/usr/productAdded3c")
	public String addProduct3c(Model model) {
		int flag = 0;
		List<UserCart> userCartList = repository.findAll();
		for (UserCart usr:userCartList) {
			if(usr.getEmail().equals("user2@mail.com")) {
				ArrayList<String> ar = usr.getAr();
				ar.add("3c");
				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
				repository.save(usrcart);
				flag=1;
			}
		}
		if(flag==0){
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("3c");
			UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
			repository.save(usrcart);
		}
		List<UserCart> updatedUserCartList = repository.findAll();
		model.addAttribute("carts",updatedUserCartList);
		return "catlog";
	}
	
	@PostMapping("/usr/productAdded4d")
	public String addProduct4d(Model model) {
		int flag = 0;
		List<UserCart> userCartList = repository.findAll();
		for (UserCart usr:userCartList) {
			if(usr.getEmail().equals("user2@mail.com")) {
				ArrayList<String> ar = usr.getAr();
				ar.add("4d");
				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
				repository.save(usrcart);
				flag=1;
			}
		}
		if(flag==0){
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("4d");
			UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
			repository.save(usrcart);
		}
		List<UserCart> updatedUserCartList = repository.findAll();
		model.addAttribute("carts",updatedUserCartList);
		return "catlog";
	}
	
}
