package app.service;

import app.bean.Customer;
import java.util.List;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);

	List<Customer> getAllListOfCustomers();
	Customer updateCustomer(Customer customer,long id);

}
