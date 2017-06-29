package com.springdata.demo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.springdata.config.PersistenceContext;
import com.springdata.entity.Employee;
import com.springdata.repositories.EmployeeRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.domain.Specification;

public class Dummy {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
        EmployeeRepository employeeRepository=applicationContext.getBean(EmployeeRepository.class);
        
        Employee employee= new Employee();
        employee.setId(1);
        employee.setAge(27);
        employee.setName("Peter");
        employee.setSalary(20000);
        
        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setAge(29);
        employee2.setName("Scala");
        employee2.setSalary(20000);
        
        Employee employee3= new Employee();
        employee3.setId(3);
        employee3.setAge(27);
        employee3.setName("Hola");
        employee3.setSalary(20000);
        
        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setAge(30);
        employee4.setName("Hehe");
        employee4.setSalary(20000);
        
        Employee employee6 = new Employee();
        employee6.setId(6);
        employee6.setAge(27);
        employee6.setName("Hola");
        employee6.setSalary(2000000);
        
        Employee employee5= new Employee();
        employee5.setId(5);
        employee5.setAge(27);
        employee5.setName("Hola");
        employee5.setSalary(200000);
        
        employeeRepository.save(employee);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);
        employeeRepository.save(employee5);
        employeeRepository.save(employee6);

        //EmployeeJPARepository employeeJPARepository = applicationContext.getBean(EmployeeJPARepository.class);

          List<Employee> employeesGT2 = employeeRepository.findByNameOrderByIdAsc("Hola");
          for(Employee emp : employeesGT2){
        	  System.out.println("Employee Id : " + emp.getId() + " , name is : " + emp.getName());
          }
          
          
        
        System.out.println("---------Here----------");
    }
}
