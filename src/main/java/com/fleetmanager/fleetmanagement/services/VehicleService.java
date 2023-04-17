package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.Vehicle;
import com.fleetmanager.fleetmanagement.models.dto.VehicleDto;

import java.util.List;

public interface VehicleService {
    Vehicle createVehicle(VehicleDto newVehicle);
    Vehicle updateVehicleInfo(Long id, VehicleDto newVehicle);
    Vehicle loadVehicle(Long id, VehicleDto vehicleDto);
    List<Vehicle> getAllLoadedVehicle();
    List<Vehicle> getAllFreeVehicle();
    Vehicle getAVehicle(Long id);
    void  deleteVehicle(Long id);
}
