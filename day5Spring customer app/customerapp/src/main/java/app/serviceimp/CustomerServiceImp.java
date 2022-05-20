package app.serviceimp;

import java.util.List;

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
	public List<Customer>getAllListofCustomers(){
		List<Customer>listofcustomers=mylocalrepository.findAll();
		return listofcustomers;
	}
	
	@Override
	public Customer updateCustomer(Customer customer,long id) {
		customer.setId(id);
	
	
	Customer updatedcustomer=mylocalrepository.save(customer);
	return updatedcustomer;
	
	}
	
	
}

