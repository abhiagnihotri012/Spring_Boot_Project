package com.neosoft.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.springboot.entity.Car;
import com.neosoft.springboot.repository.CarRepository;



@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;	
	
	@Override
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	@Override
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}

	@Override
	public Car getCarById(Long id) {
		return carRepository.findById(id).get();
	}

	@Override
	public Car updateCar(Car car) {		
		return carRepository.save(car);
	}

	@Override
	public void deleteCarById(Long id) {
		carRepository.deleteById(id);	
	}
}
