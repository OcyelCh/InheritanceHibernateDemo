package com.inheritance.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;

@Service
public interface StrategyService {

	List<VehicleSingleTable> getSingleTable();
	List<VehiclePerClass> getPerClass();
	List<VehicleJoined> getJoined();
}