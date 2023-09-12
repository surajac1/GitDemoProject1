package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.main.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>{
	public Employee findById(int id);

}
