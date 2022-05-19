package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.bean.Customer;
import app.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	@PostMapping(value="/addcustomer")
	Customer addCustomer(@RequestBody Customer customer) {
		Customer custom = customerservice.addCustomer(customer);
		return custom;
	}

}
