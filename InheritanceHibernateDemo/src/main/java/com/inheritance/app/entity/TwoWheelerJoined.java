package com.inheritance.app.entity;

import javax.persistence.Entity;

@Entity
public class TwoWheelerJoined extends VehicleJoined {

	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
}
