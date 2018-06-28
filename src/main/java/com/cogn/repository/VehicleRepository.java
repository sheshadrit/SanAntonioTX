package com.cogn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cogn.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
