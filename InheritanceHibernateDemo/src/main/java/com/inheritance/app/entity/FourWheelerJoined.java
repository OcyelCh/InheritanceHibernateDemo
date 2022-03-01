package com.inheritance.app.entity;

import javax.persistence.Entity;

@Entity
public class FourWheelerJoined extends VehicleJoined {

	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
}
