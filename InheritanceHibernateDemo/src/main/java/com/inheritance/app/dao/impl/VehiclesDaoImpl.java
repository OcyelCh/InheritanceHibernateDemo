package com.inheritance.app.dao.impl;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository
public class VehiclesDaoImpl implements VehiclesDao{

	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> handlers = new ArrayList<String>();
	static ArrayList<String> steerings = new ArrayList<String>();
	
	public void initArrays()
	{
		names.add("Bolvo");
		names.add("Jonda");
		names.add("Gerrarri");
		names.add("FolksWagen");
		names.add("Missan");
		handlers.add("Bike Handler");
		handlers.add("Motorcycle Handler");
		handlers.add("Quad bike Handler");
		handlers.add("Water bike Handler");
		handlers.add("Air bike Handler");
		steerings.add("Car Steering Wheel");
		steerings.add("Plane Steering Wheel");
		steerings.add("Monster Truck Steering Wheel");
		steerings.add("Autobots Steering Wheel");
		steerings.add("Spaceship Steering Wheel");
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void saveVehicleSingle(VehicleSingleTable vehicle, TwoWheelerSingleTable twoWheeler,
			FourWheelerSingleTable fourWheeler) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.getTransaction().commit();
		session.close();

		System.out.println("Data saved succesfully using single table strategy");
		
	}

	@Override
	public void saveVehiclePerClass(VehiclePerClass vehicle, TwoWheelerPerClass twoWheeler,
			FourWheelerPerClass fourWheeler) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.getTransaction().commit();
		session.close();

		System.out.println("Data saved succesfully using table per class strategy");
		
	}

	@Override
	public void saveVehicleJoined(VehicleJoined vehicle, TwoWheelerJoined twoWheeler, FourWheelerJoined fourWheeler) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.getTransaction().commit();
		session.close();

		System.out.println("Data saved succesfully using joined table strategy");
		
	}
	
	@Override
	public String randomName() {
		String randomName;
		randomName = names.get((int)(Math.random()*(5-0)+0));
		return randomName;
	}

	@Override
	public String randomHandle() {
		String randomHandle;
		randomHandle = handlers.get((int)(Math.random()*(5-0)+0));
		return randomHandle;
	}

	@Override
	public String randomSteering() {
		String randomSteerings;
		randomSteerings = steerings.get((int)(Math.random()*(5-0)+0));
		return randomSteerings;
	}

	@Override
	public Size randomSize() {
		int x = (int)(Math.random()*(4-1)+1);
		if (x == 1)
			return Size.BIG;
		else if (x == 2)
			return Size.MEDIUM;
		else
			return Size.SMALL;
		
	}


}