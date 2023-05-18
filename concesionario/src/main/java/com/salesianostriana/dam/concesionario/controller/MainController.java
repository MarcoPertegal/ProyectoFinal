package com.salesianostriana.dam.concesionario.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.concesionario.model.Motocicleta;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;

@Controller
public class MainController {
	
	@Autowired
	MotocicletaService motocicletaService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/novedades")
	public String novedades() {
		return "novedades";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	
	@GetMapping("/formularioCliente")
	public String formularioCliente() {
		return "formularioCliente";
	}
	
	@GetMapping("/login")
	public String formularioLogin() {
		return "login";
	}
	@GetMapping("/admin/indexAdmin")
	public String indexAdmin() {
		return "/admin/indexAdmin";
	}
	@GetMapping("/motocicletas")
	public String motocicletas() {
		return "motocicletas";
	}
	
	@GetMapping("/motocicleta/{id}")
	public String mostrarDetails(@PathVariable("id") Long id, Model model) {
		Optional<Motocicleta> optionalMotocicleta = motocicletaService.findById(id);
		optionalMotocicleta.ifPresent(motocicleta -> {
	        model.addAttribute("motocicleta", motocicleta);
	    });
	    return optionalMotocicleta.map(motocicleta -> "detailsMotocicleta")
	    						.orElse("redirect:/motocicletas");
		
		/*
		//Buscamos el producto por id
		Producto p = productoService.findById(id);
		//Si el producto no es null (si existe el producto buscado) se añade al modelo y mostramos la página del detalle detail.html
		//Si no existe, volvemos a la página index que vuelve a realizar todo lo que hace el método index
		if (p != null) {
			model.addAttribute("producto", p);
			return "detail";
		}
		
		return "redirect:/";
		*/
	}
	
	
	
}
