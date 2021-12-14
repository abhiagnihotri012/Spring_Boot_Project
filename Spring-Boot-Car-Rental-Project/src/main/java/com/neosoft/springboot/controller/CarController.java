package com.neosoft.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.neosoft.springboot.entity.Car;
import com.neosoft.springboot.service.CarServiceImpl;

@Controller
public class CarController {

	@Autowired
	private CarServiceImpl carServiceImpl;
	//---------------------------------------------
	@GetMapping("/cars")
	public String listcars(Model model) {
		
		model.addAttribute("cars",carServiceImpl.getAllCars());
		
		return "cars";
	}
	//---------------------------------------------------
	@GetMapping("/cars/new")
	public String createCarForm(Model model) {
		
		Car car = new Car();                   
		model.addAttribute("car", car);
		
		return "create_car";
	}
	//---------------------------------------------------
	@PostMapping("/cars")
	public String saveCar(@ModelAttribute("car") Car car) {
		
		carServiceImpl.saveCar(car);
		
		return "redirect:/cars";
	}
	
	@GetMapping("/cars/edit/{id}")
	public String editCarForm(@PathVariable Long id, Model model) {
		
		model.addAttribute("car",carServiceImpl.getCarById(id));
		
		return "edit_car";
	}
	//------------------------------------------------------------
	@PostMapping("/cars/{id}")
	public String updateCar(@PathVariable Long id, 
			@ModelAttribute("car") Car car,	Model model) {
	
		
		Car existingcar = carServiceImpl.getCarById(id);
		existingcar.setId(id);
		existingcar.setCarno(car.getCarno());
		existingcar.setCarmodel(car.getCarmodel());
		existingcar.setBrand(car.getBrand());			
		existingcar.setQuantity(car.getQuantity());	
		carServiceImpl.updateCar(existingcar);
		
		return "redirect:/cars";
	}
	//------------------------------------------------------
	@GetMapping("/cars/{id}")
	public String deleteCar(@PathVariable Long id) {
		
		carServiceImpl.deleteCarById(id);
		
		return "redirect:/cars";
	}	//--------------------------------------------------------
}