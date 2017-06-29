package com.springdata.repositories;



import java.util.List;

import com.springdata.entity.Employee;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> , JpaSpecificationExecutor<Employee> {
	
	List<Employee> findByNameOrderByIdAsc(String string);
	
}
