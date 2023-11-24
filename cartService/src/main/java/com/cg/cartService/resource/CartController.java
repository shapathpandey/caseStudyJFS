package com.cg.cartService.resource;

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

import com.cg.cartService.model.Product;
import com.cg.cartService.model.UserCart;
import com.cg.cartService.service.CartRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Controller
@RequestMapping("/admin")
public class CartController {
	
	@Autowired
	private CartRepository repository;
	
	@Autowired
    private RestTemplate restTemplate;
	

	@GetMapping("/admin")
	public String adminPage(Model model) {
		List<UserCart> userCartList = repository.findAll();
		model.addAttribute("carts",userCartList);
		return "adminPage";
	}
	
	@GetMapping("/ProductsPage")
	public String adminPage() {
		return "productsAdminPage";
	}
	
	
//	@GetMapping("/usr/catlog")
//	public ModelAndView showCatlog(@ModelAttribute Product product1) {
//		product1.setId("12");
//		ModelAndView modelAndView = new ModelAndView();    
//		modelAndView.setViewName("shop");        
//		modelAndView.addObject("product1", new Product());      
//		return modelAndView;    
//	}
//	
//	@GetMapping("/usr/cart")
//	public String productAdded() {
//		return "productAdded";
//	}
	
//	@PostMapping("/usr/productAdded1a")
//	public String addProduct1a(Model model) {
//		
//		List<UserCart> userCartList = repository.findAll();
//		for (UserCart usr:userCartList) {
//			if(usr.getEmail().equals("user2@mail.com")) {
//				ArrayList<String> ar = usr.getAr();
//				ar.add("1a");
//				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
//				repository.save(usrcart);
//			}
//		}
//		model.addAttribute("carts",userCartList);
//		return "catlog";
//	}
//	
//	@PostMapping("/usr/productAdded2b")
//	public String addProduct2b(Model model) {
//		List<UserCart> userCartList = repository.findAll();
//		for (UserCart usr:userCartList) {
//			if(usr.getEmail().equals("user2@mail.com")) {
//				ArrayList<String> ar = usr.getAr();
//				ar.add("2b");
//				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
//				repository.save(usrcart);
//			}
//		}
//		model.addAttribute("carts",userCartList);
//		return "catlog";
//	}
//	
//	@PostMapping("/usr/productAdded3c")
//	public String addProduct3c(Model model) {
//		List<UserCart> userCartList = repository.findAll();
//		for (UserCart usr:userCartList) {
//			if(usr.getEmail().equals("user2@mail.com")) {
//				ArrayList<String> ar = usr.getAr();
//				ar.add("3c");
//				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
//				repository.save(usrcart);
//			}
//		}
//		model.addAttribute("carts",userCartList);
//		return "catlog";
//	}
//	
//	@PostMapping("/usr/productAdded4d")
//	public String addProduct4d(Model model) {
//		List<UserCart> userCartList = repository.findAll();
//		for (UserCart usr:userCartList) {
//			if(usr.getEmail().equals("user2@mail.com")) {
//				ArrayList<String> ar = usr.getAr();
//				ar.add("4d");
//				UserCart usrcart = new UserCart("user2@mail.com","user2@mail.com",ar);
//				repository.save(usrcart);
//			}
//		}
//		model.addAttribute("carts",userCartList);
//		return "catlog";
//	}
	
}
