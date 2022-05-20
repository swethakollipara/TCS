package app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.bean.Customer;
@Repository
public interface MyLocalrepository extends JpaRepository<Customer,Long> {
	

}
