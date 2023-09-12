package com.webservice.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.main.model.Employee;
import com.webservice.main.repository.HomeRepository;
import com.webservice.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	@Override
	public Employee saveData(Employee e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}
	@Override
	public Employee getData(int id) {
		// TODO Auto-generated method stub
		return 		(Employee) hr.findById(id);

		
	}

}
