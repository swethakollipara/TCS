package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		System.out.println("customer->>>>>"+custom.getCustomername());
		System.out.println("age->>>>>"+custom.getAge());
		System.out.println("location->>>>>"+custom.getLocation());
		return custom;
	}
	@GetMapping(value="/viewallofcustomer")
	List<Customer>viewAllListOfCustomer(){
		
		return customerservice.getAllListOfCustomers();
	}
	@PutMapping(value="/updatecustomer?{id}")
	Customer updateCustomer(@RequestBody Customer updatecustomer,@PathVariable long id ) {
		Customer updatedDetails=customerservice.updateCustomer(updatecustomer,id);
		return updatedDetails;
	}

}
