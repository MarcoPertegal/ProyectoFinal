package com.salesianostriana.dam.concesionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.concesionario.service.TrabajadorService;

@Controller
@RequestMapping("/admin/trabajador")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService trabajadorService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listaTrabajadores", trabajadorService.findAll());
		return "admin/trabajadores";
	}
}
