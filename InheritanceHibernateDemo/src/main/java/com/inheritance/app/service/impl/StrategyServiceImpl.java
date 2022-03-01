package com.inheritance.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inheritance.app.dao.StrategyDao;
import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;
import com.inheritance.app.service.StrategyService;

@Service
public class StrategyServiceImpl implements StrategyService{

	@Autowired
	StrategyDao strategyDao;
	

	@Override
	public List<VehicleSingleTable> getSingleTable() {
		// TODO Auto-generated method stub
		return strategyDao.getSingleTable();
	}

	@Override
	public List<VehiclePerClass> getPerClass() {
		// TODO Auto-generated method stub
		return strategyDao.getPerClass();
	}

	@Override
	public List<VehicleJoined> getJoined() {
		// TODO Auto-generated method stub
		return strategyDao.getJoined();
	}
}