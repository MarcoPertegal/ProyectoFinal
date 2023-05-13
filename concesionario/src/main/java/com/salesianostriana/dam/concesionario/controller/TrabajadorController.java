package com.salesianostriana.dam.concesionario.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.service.TrabajadorService;

@Controller
@RequestMapping("/admin/trabajador")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService trabajadorService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listaTrabajadores", trabajadorService.findAll());
		return "admin/listTrabajador";
	}
	
	@GetMapping("/nuevo")
	public String nuevoTrabajador(Model model) {
		model.addAttribute("trabajador", new Trabajador());
		return "admin/formTrabajador";
	}
	
	@PostMapping("/nuevo/submit")
	public String submitNuevoTrabajador(@ModelAttribute("trabajador") Trabajador trabajador, Model model) {
		trabajadorService.save(trabajador);
		return "redirect:/admin/trabajador/";
	}
	
	
	@GetMapping("/editar/{id}")
	public String editarTrabajador(@PathVariable("id") Long id, Model model) {
	    Optional<Trabajador> optionalTrabajador = trabajadorService.findById(id);
	    
	    if (optionalTrabajador.isPresent()) {
	        Trabajador trabajador = optionalTrabajador.get();
	        model.addAttribute("trabajador", trabajador);
	        return "admin/formTrabajador";
	    } else {
	        return "redirect:/admin/trabajador/";
	    }
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarTrabajador(@PathVariable("id") Long id, Model model) {
	    Optional<Trabajador> optionalTrabajador = trabajadorService.findById(id);
	    
	    if (optionalTrabajador.isPresent()) {
	        Trabajador trabajador = optionalTrabajador.get();
	        trabajadorService.delete(trabajador);
	        
	        return "redirect:/admin/trabajador/";
	    } else {
	    	
	    	return "redirect:/admin/trabajador/";
	    }
	    
	}


		
		
}
