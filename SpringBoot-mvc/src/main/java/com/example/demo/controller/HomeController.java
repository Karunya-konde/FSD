package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("customer") Customer customer, Model model) {
		Customer theCustomer = customerService.saveCustomer(customer);
		model.addAttribute("customer", theCustomer);
		return "process-form";
	}
}
