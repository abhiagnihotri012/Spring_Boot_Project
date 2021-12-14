package com.neosoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.springboot.entity.Car;

public interface CarRepository extends JpaRepository<Car,Long> {

}
