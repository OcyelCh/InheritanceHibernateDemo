package com.inheritance.app.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inheritance.app.dao.VehiclesDao;
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
import com.inheritance.app.service.VehiclesService;

@Service
public class VehiclesServiceImpl implements VehiclesService{

	
	@Autowired
	VehiclesDao vehiclesDao;
	
	@Override
	public void saveVehicleSingle(VehicleSingleTable vehicle, TwoWheelerSingleTable twoWheeler,
			FourWheelerSingleTable fourWheeler) {
		vehiclesDao.saveVehicleSingle(vehicle, twoWheeler, fourWheeler);
		
	}

	@Override
	public void saveVehiclePerClass(VehiclePerClass vehicle, TwoWheelerPerClass twoWheeler,
			FourWheelerPerClass fourWheeler) {
		vehiclesDao.saveVehiclePerClass(vehicle, twoWheeler, fourWheeler);
		
	}

	@Override
	public void saveVehicleJoined(VehicleJoined vehicle, TwoWheelerJoined twoWheeler, FourWheelerJoined fourWheeler) {
		vehiclesDao.saveVehicleJoined(vehicle, twoWheeler, fourWheeler);
		
	}

	@Override
	public String randomName() {
		// TODO Auto-generated method stub
		return vehiclesDao.randomName();
	}

	@Override
	public String randomHandle() {
		// TODO Auto-generated method stub
		return vehiclesDao.randomHandle();
	}

	@Override
	public String randomSteering() {
		// TODO Auto-generated method stub
		return vehiclesDao.randomSteering();
	}

	@Override
	public void initArrays() {
		vehiclesDao.initArrays();
		
	}

	@Override
	public Size randomSize() {
		// TODO Auto-generated method stub
		return vehiclesDao.randomSize();
	}
}