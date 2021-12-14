package com.neosoft.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.springboot.entity.Car;
import com.neosoft.springboot.entity.CarIssueDetail;
import com.neosoft.springboot.repository.CarIssueDetailRepository;





	@Service
	public class CarIssueDetailServiceImpl implements CarIssueDetailService {

		@Autowired
		private CarIssueDetailRepository carIssueDetailRepository;	
		
	
		@Override
		public List<CarIssueDetail> getAllIssuedCars() {
			return carIssueDetailRepository.findAll();
		}
		
		@Override
		public CarIssueDetail getCarIssueDetailById(Long id) {
			return carIssueDetailRepository.findById(id).get();
		}


		@Override
		public CarIssueDetail saveIssuedCars(CarIssueDetail carIssueDetail) {
			return carIssueDetailRepository.save(carIssueDetail);
		}


		@Override
		public CarIssueDetail updateIssuedCars(CarIssueDetail carIssueDetail) {		
			return carIssueDetailRepository.save(carIssueDetail);
		}

		
}
	
