package com.inheritance.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.inheritance.app.entity.VehicleJoined;
import com.inheritance.app.entity.VehiclePerClass;
import com.inheritance.app.entity.VehicleSingleTable;
import com.inheritance.app.service.StrategyService;

@Controller
public class StrategyController {

	@Autowired
	StrategyService strategyService;
	
	@RequestMapping(value="/getSingleVehicles", method= RequestMethod.GET)
	public ModelAndView getSingleExample(ModelAndView modelAndView) {
		List<VehicleSingleTable> vehiclesList = strategyService.getSingleTable();
		modelAndView.addObject("vehiclesList", vehiclesList);
		modelAndView.setViewName("vehiclesSingleview");
		return modelAndView;
	}
	@RequestMapping(value="/getPerClass", method= RequestMethod.GET)
	public ModelAndView getPerClassExample(ModelAndView modelAndView) {
		List<VehiclePerClass> vehiclesList = strategyService.getPerClass();
		modelAndView.addObject("vehiclesList", vehiclesList);
		modelAndView.setViewName("vehiclesPerClassview");
		return modelAndView;
	}
	@RequestMapping(value="/getJoined", method= RequestMethod.GET)
	public ModelAndView getJoinedExample(ModelAndView modelAndView) {
		List<VehicleJoined> vehiclesList = strategyService.getJoined();
		modelAndView.addObject("vehiclesList", vehiclesList);
		modelAndView.setViewName("vehiclesJoinedview");
		return modelAndView;
	}
	

}