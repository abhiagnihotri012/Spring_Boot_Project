package com.neosoft.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.neosoft.springboot.entity.CarIssueDetail;
import com.neosoft.springboot.service.CarIssueDetailServiceImpl;




@Controller
public class CarIssueController {

	@Autowired
	private CarIssueDetailServiceImpl carIssueDetailServiceImpl;
	//---------------------------------------------
	@GetMapping("/issuecar")
	public String listcars(Model model) {
		
		model.addAttribute("carIssueDetails",carIssueDetailServiceImpl.getAllIssuedCars());
		
		return "viewissued";
	}
	//---------------------------------------------------
	@GetMapping("/issuecar/new")
	public String createCarForm(Model model) {
		
		CarIssueDetail carIssueDetail = new CarIssueDetail();                   
		model.addAttribute("carIssueDetail", carIssueDetail);
		
		return "book_car";
	}
	//---------------------------------------------------
	@PostMapping("/viewissued")
	public String saveCar(@ModelAttribute("carIssueDetail") CarIssueDetail carIssueDetail) {
		
		carIssueDetailServiceImpl.saveIssuedCars(carIssueDetail);
		
		return "redirect:/issuecar";
	}
	
//	@GetMapping("/cars/edit/{id}")
//	public String editCarForm(@PathVariable Long id, Model model) {
//		
//		model.addAttribute("car",carIssueDetailServiceImpl.getCarById(id));
//		
//		return "edit_car";
//	}
	//------------------------------------------------------------
//	@PostMapping("/carissuedetail/{id}")
//	public String updateCar(@PathVariable Long id, 
//			@ModelAttribute("carIssueDetail") CarIssueDetail carIssueDetail,	Model model) {
//	
//		
//		CarIssueDetail existingcar = carIssueDetailServiceImpl.getCarIssueDetailById(id);
//		existingcar.setId(id);
//		existingcar.setCarno(carIssueDetail.getCarno());
//		existingcar.setCustomerid(carIssueDetail.getCustomerid());
//		existingcar.setCustomername(carIssueDetail.getCustomername());			
//		existingcar.setCustomermobile(carIssueDetail.getCustomermobile());	
//		
//		//logic for date
//		existingcar.setIssuedate(carIssueDetail.getIssuedate());
//		existingcar.setReturndate(carIssueDetail.getReturndate());
//		existingcar.setReturnstatus(carIssueDetail.getReturnstatus());
//		carIssueDetailServiceImpl.updateIssuedCars(existingcar);
//		
//		return "redirect:/cars";
//	}
	//------------------------------------------------------
//	@GetMapping("/cars/{id}")
//	public String deleteCar(@PathVariable Long id) {
//		
//		carIssueDetailServiceImpl.deleteCarById(id);
//		
//		return "redirect:/cars";
//	}	//--------------------------------------------------------
}