package com.carrentingservice.vehiclelisting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrentingservice.vehiclelisting.domain.VehicleInventoryEntity;

@Repository
public interface VehicleInventoryRepo extends JpaRepository<VehicleInventoryEntity, String> {

}
