package com.salesianostriana.dam.proyectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.proyectoFinal.service.TrabajadorService;

@Controller
public class TrabajadorController {
	
	@Autowired
	@RequestMapping("")
	private TrabajadorService trabajadorService;
	
	public TrabajadorController(TrabajadorService service) {
		this.trabajadorService = service;
	}
}
