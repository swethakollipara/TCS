package app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import app.bean.Customer;

public interface MyLocalrepository extends JpaRepository<Customer,Long> {
	

}
