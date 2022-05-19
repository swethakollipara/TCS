package app.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.bean.Customer;
import app.repositary.MyLocalrepository;
import app.service.CustomerService;
@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	MyLocalrepository mylocalrepository; 
	
	@Override
	public Customer addCustomer(Customer customer) {
	
	
	Customer customeradded=mylocalrepository.save(customer);
	return customeradded;
	
	}
	
}

