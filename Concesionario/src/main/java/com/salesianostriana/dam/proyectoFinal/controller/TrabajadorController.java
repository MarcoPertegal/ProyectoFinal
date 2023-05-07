package com.salesianostriana.dam.proyectoFinal.controller;

import org.springframework.stereotype.Controller;

import com.salesianostriana.dam.proyectoFinal.service.TrabajadorService;

@Controller
public class TrabajadorController {
	
	private TrabajadorService trabajadorService;
	
	public TrabajadorController(TrabajadorService service) {
		this.trabajadorService = service;
	}
}
