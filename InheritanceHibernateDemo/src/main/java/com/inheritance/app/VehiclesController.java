package com.inheritance.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

@Controller
public class VehiclesController {

	@Autowired
	VehiclesService vehiclesService;
	
	//Sort of welcome page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showMainPage(Model model) {
		vehiclesService.initArrays();
		return "mainPage"; 	//This is a view		
	}
	
	@RequestMapping(value = "/singleExample", method = RequestMethod.GET)
	public String singleExample(Model model) {
		VehicleSingleTable vehicle = new VehicleSingleTable();
		TwoWheelerSingleTable bike = new TwoWheelerSingleTable();
		FourWheelerSingleTable car = new FourWheelerSingleTable();
		vehicle.setVehicleName(vehiclesService.randomName());
		bike.setVehicleName(vehiclesService.randomName());
		car.setVehicleName(vehiclesService.randomName());
		bike.setSteeringHandle(vehiclesService.randomHandle());
		car.setSteeringWheel(vehiclesService.randomSteering());
		vehicle.setSize(vehiclesService.randomSize());
		bike.setSize(vehiclesService.randomSize());
		car.setSize(vehiclesService.randomSize());
		vehiclesService.saveVehicleSingle(vehicle, bike, car);
		return "redirect:/getSingleVehicles";   //This is a view
	}
	
	@RequestMapping(value = "/perClassExample", method = RequestMethod.GET)
	public String perClassExample(Model model) {
		VehiclePerClass vehicle = new VehiclePerClass();
		TwoWheelerPerClass bike = new TwoWheelerPerClass();
		FourWheelerPerClass car = new FourWheelerPerClass();
		vehicle.setVehicleName(vehiclesService.randomName());
		bike.setVehicleName(vehiclesService.randomName());
		car.setVehicleName(vehiclesService.randomName());
		bike.setSteeringHandle(vehiclesService.randomHandle());
		car.setSteeringWheel(vehiclesService.randomSteering());
		vehicle.setSize(vehiclesService.randomSize());
		bike.setSize(vehiclesService.randomSize());
		car.setSize(vehiclesService.randomSize());
		vehiclesService.saveVehiclePerClass(vehicle, bike, car);
		return "redirect:/getPerClass";   //This is a view
	}
	@RequestMapping(value = "/joinedExample", method = RequestMethod.GET)
	public String joinedExample(Model model) {
		VehicleJoined vehicle = new VehicleJoined();
		TwoWheelerJoined bike = new TwoWheelerJoined();
		FourWheelerJoined car = new FourWheelerJoined();
		vehicle.setVehicleName(vehiclesService.randomName());
		bike.setVehicleName(vehiclesService.randomName());
		car.setVehicleName(vehiclesService.randomName());
		bike.setSteeringHandle(vehiclesService.randomHandle());
		car.setSteeringWheel(vehiclesService.randomSteering());
		vehicle.setSize(vehiclesService.randomSize());
		bike.setSize(vehiclesService.randomSize());
		car.setSize(vehiclesService.randomSize());
		vehiclesService.saveVehicleJoined(vehicle, bike, car);
		return "redirect:/getJoined";   //This is a view
	}
	
}