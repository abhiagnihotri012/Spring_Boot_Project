package com.neosoft.springboot.service;

import java.util.List;

import com.neosoft.springboot.entity.CarIssueDetail;


public interface CarIssueDetailService {
   
	public CarIssueDetail getCarIssueDetailById(Long id);
	public List<CarIssueDetail> getAllIssuedCars(); // view all issued cars
	public CarIssueDetail saveIssuedCars(CarIssueDetail carIssueDetail);//create
	
	public CarIssueDetail updateIssuedCars(CarIssueDetail carIssueDetail); //return car
	
}
