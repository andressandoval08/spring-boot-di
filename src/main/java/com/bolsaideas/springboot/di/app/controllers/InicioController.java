package com.bolsaideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsaideas.springboot.di.app.models.service.IServicio;

@Controller
public class InicioController {
	@Autowired
	private IServicio servicio;
		
	@GetMapping({"/", "","/inicio"})
	public String inicio(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		
		return "inicio";
	}



	

	
}
