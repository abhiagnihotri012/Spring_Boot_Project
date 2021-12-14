package com.neosoft.springboot.entity;


import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="carowner")
public class CarOwner {
          
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private long id;
	   
	   @Column
	   private String carno;
	   
	   @Column
	   private String name;
	   
	   @Column
	   private String email;
	   
	   @Column
	   private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}
	  
			 
}
