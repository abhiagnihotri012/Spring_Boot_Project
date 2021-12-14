package com.neosoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.springboot.entity.CarOwner;

public interface CarOwnerRepository extends JpaRepository<CarOwner,Long>{

}
