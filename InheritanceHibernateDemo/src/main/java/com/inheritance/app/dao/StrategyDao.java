package com.inheritance.app.dao;

import java.util.List;

import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;


public interface StrategyDao {

	List<VehicleSingleTable> getSingleTable();
	List<VehiclePerClass> getPerClass();
	List<VehicleJoined> getJoined();


}
