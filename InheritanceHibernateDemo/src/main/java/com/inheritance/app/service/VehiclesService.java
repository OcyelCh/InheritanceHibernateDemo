package com.inheritance.app.service;

import org.springframework.stereotype.Service;

import com.inheritance.app.entity.FourWheelerJoined;
import com.inheritance.app.entity.FourWheelerPerClass;
import com.inheritance.app.entity.FourWheelerSingleTable;
import com.inheritance.app.entity.Size;
import com.inheritance.app.entity.TwoWheelerJoined;
import com.inheritance.app.entity.TwoWheelerPerClass;
import com.inheritance.app.entity.TwoWheelerSingleTable;
import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;

@Service
public interface VehiclesService {

	void initArrays();
	
	void saveVehicleSingle(VehicleSingleTable vehicle, TwoWheelerSingleTable twoWheeler, FourWheelerSingleTable fourWheeler);
	
	void saveVehiclePerClass(VehiclePerClass vehicle, TwoWheelerPerClass twoWheeler, FourWheelerPerClass fourWheeler);
	
	void saveVehicleJoined(VehicleJoined vehicle, TwoWheelerJoined twoWheeler, FourWheelerJoined fourWheeler);

	String randomName();
	
	String randomHandle();
	String randomSteering();
	
	Size randomSize();
}