package com.inheritance.app.dao.impl;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inheritance.app.dao.StrategyDao;
import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;

@Repository
public class StrategyDaoImpl implements StrategyDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	


	@Override
	public List<VehicleSingleTable> getSingleTable() {
		// TODO Auto-generated method stub
		List<VehicleSingleTable> vehicleList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		vehicleList =session.createQuery("FROM VehicleSingleTable").list();
		session.getTransaction().commit();
		session.close();
		
		return vehicleList;
	}

	@Override
	public List<VehiclePerClass> getPerClass() {
		List<VehiclePerClass> vehicleList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		vehicleList =session.createQuery("FROM VehiclePerClass").list();
		session.getTransaction().commit();
		session.close();
		
		return vehicleList;
	}

	@Override
	public List<VehicleJoined> getJoined() {
		List<VehicleJoined> vehicleList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		vehicleList =session.createQuery("FROM VehicleJoined").list();
		session.getTransaction().commit();
		session.close();
		
		return vehicleList;
	}
}