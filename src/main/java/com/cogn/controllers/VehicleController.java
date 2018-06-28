package com.cogn.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogn.entity.Vehicle;
import com.cogn.repository.VehicleRepository;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepo;
	
	@RequestMapping("/vehicleInfo")
	public List<Vehicle> getVehicle() {
		return vehicleRepo.findAll();
	}
}
