package com.salesianostriana.dam.concesionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.service.TrabajadorService;

@Controller
@RequestMapping("/admin")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService trabajadorService;
	
	@GetMapping("/listTrabajadores")
	public String index(Model model) {
		model.addAttribute("listaTrabajadores", trabajadorService.findAll());
		return "admin/listTrabajadores";
	}
	
	@GetMapping("/nuevo")
	public String nuevoTrabajador(Model model) {
		model.addAttribute("trabajador", new Trabajador());
		return "admin/formTrabajadores";
	}
	
	@PostMapping("/nuevo/listTrabajadores")
	public String submitNuevoTrabajador(@ModelAttribute("trabajador") Trabajador trabajador, Model model) {

		trabajadorService.save(trabajador);
		
		return "redirect:/admin/listTrabajadores";
	}
}
