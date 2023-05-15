package com.salesianostriana.dam.concesionario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
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
		return "/motocicletas";
	}
	
	
	
}
