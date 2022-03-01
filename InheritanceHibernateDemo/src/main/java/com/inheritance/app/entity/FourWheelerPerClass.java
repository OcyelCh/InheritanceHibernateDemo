package com.inheritance.app.entity;

import javax.persistence.Entity;

@Entity
public class FourWheelerPerClass extends VehiclePerClass {
	
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

}
