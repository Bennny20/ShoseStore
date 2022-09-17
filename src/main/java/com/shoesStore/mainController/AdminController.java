package com.shoesStore.mainController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoesStore.dao.ProductDao;

@Controller
public class AdminController {
	
	//@Autowired
	// private OrderDao orderDao;
	
	@Autowired
	 private ProductDao productDao;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/403")
	public String accessDenied() {
		return "/403";
	}
	
	@GetMapping(value = {"/order"})
	public String orderView(Model model, @RequestParam("OrderID") String OrderID) {
		return "order";
	}
	

	@GetMapping(value = {"/orderDetail"})
	public String orderDetailView(Model model, @RequestParam("OrderDetailID") String OrderDetailID) {
		return "order";
	}
	
	@GetMapping(value = {"/product"})
	public String productView(Model model, @RequestParam(value = "productCode", defaultValue = "") String productCode) {
		return "product";
	}
	
	@GetMapping(value = {"/accountInfo"})
	public String accountInfo(HttpServletRequest request, Model model) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext();
		System.out.println("username: " + userDetails.getUsername());
		System.out.println("password: " + userDetails.getPassword());
		System.out.println("enable: " + userDetails.isEnabled());
		
		model.addAttribute("userDetails", userDetails);
		
		return "accountInfo";
	}
	
	// POST : Save product
	@PostMapping(value = {"/productSave"})
	// Thieu valid
	public String productSave(Model model, @ModelAttribute("productForm") BindingResult result ) {
		return "index";
	}

}
