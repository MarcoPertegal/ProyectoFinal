package com.salesianostriana.dam.concesionario.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.concesionario.model.Accesorio;
import com.salesianostriana.dam.concesionario.model.Motocicleta;
import com.salesianostriana.dam.concesionario.service.AccesorioService;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;

@Controller
public class MainController {
	
	@Autowired
	MotocicletaService motocicletaService;
	
	@Autowired
	AccesorioService accesorioService;
	
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
	@GetMapping("/accesorios")
	public String accesorios() {
		return "accesorios";
	}
	@GetMapping("/carrito")
	public String carrito() {
		return "carrito";
	}
	
	@GetMapping("/motocicleta/{id}")
	public String mostrarDetailsMotocicleta(@PathVariable("id") Long id, Model model) {
		Optional<Motocicleta> optionalMotocicleta = motocicletaService.findById(id);
		optionalMotocicleta.ifPresent(motocicleta -> {
	        model.addAttribute("motocicleta", motocicleta);
	    });
	    return optionalMotocicleta.map(motocicleta -> "detailsMotocicleta")
	    						.orElse("redirect:/motocicletas");
	}
	
	@GetMapping("/accesorio/{id}")
	public String mostrarDetailsAccesorio(@PathVariable("id") Long id, Model model) {
		Optional<Accesorio> optionalAccesorio = accesorioService.findById(id);
		optionalAccesorio.ifPresent(accesorio -> {
	        model.addAttribute("accesorio", accesorio);
	    });
	    return optionalAccesorio.map(accesorio -> "detailsAccesorio")
	    						.orElse("redirect:/accesorios");
	}
	
	
	
}
