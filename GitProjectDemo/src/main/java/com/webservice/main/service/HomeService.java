package com.webservice.main.service;

import com.webservice.main.model.Employee;

public interface HomeService {

	Employee saveData(Employee e);

	Employee getData(int id);

}
