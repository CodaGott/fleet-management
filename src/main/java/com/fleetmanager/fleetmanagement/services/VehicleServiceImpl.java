package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.Vehicle;
import com.fleetmanager.fleetmanagement.models.dto.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService{


    @Override
    public Vehicle createVehicle(VehicleDto newVehicle) {
        return null;
    }

    @Override
    public Vehicle updateVehicleInfo(Long id, VehicleDto newVehicle) {
        return null;
    }

    @Override
    public Vehicle loadVehicle(Long id, VehicleDto vehicleDto) {
        return null;
    }

    @Override
    public List<Vehicle> getAllLoadedVehicle() {
        return null;
    }

    @Override
    public List<Vehicle> getAllFreeVehicle() {
        return null;
    }

    @Override
    public Vehicle getAVehicle(Long id) {
        return null;
    }

    @Override
    public void deleteVehicle(Long id) {

    }
}
