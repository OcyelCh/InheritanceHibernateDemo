package com.inheritance.app.entity;

import javax.persistence.Entity;

@Entity
public class TwoWheelerPerClass extends VehiclePerClass {

	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
}
