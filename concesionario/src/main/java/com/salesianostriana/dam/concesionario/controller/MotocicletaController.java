package com.salesianostriana.dam.concesionario.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.concesionario.formbeans.SearchBean;
import com.salesianostriana.dam.concesionario.model.Motocicleta;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;
import com.salesianostriana.dam.concesionario.service.VentaService;

@Controller
@RequestMapping("/motocicleta")
public class MotocicletaController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private MotocicletaService motocicletaService;
	
	@Autowired
	private VentaService ventaService;
	
	
	@GetMapping("/")
	public String motocicletaList(Model model) {		
		model.addAttribute("listaMotocicletas", motocicletaService.findAll());
		model.addAttribute("searchForm", new SearchBean());
		return "motocicletas";
	}
	
	@PostMapping("/search")
	public String searchMotocicleta(@ModelAttribute("searchForm") SearchBean searchBean, Model model) {
	    model.addAttribute("listaMotocicletas", motocicletaService.findByNombre(searchBean.getSearch()));
	    return "motocicletas-lista";
	}
	

	@GetMapping("/admin")
	public String listMotocicleta(Model model) {
		model.addAttribute("listaMotocicletas", motocicletaService.findAll());
		return "admin/listMotocicleta";
	}
	
	@GetMapping("/admin/nuevo")
	public String nuevaMotocicleta(Model model) {
		model.addAttribute("motocicleta", new Motocicleta());
		return "admin/formMotocicleta";
	}
	
	@PostMapping("/admin/nuevo/submit")
	public String submitNuevaMotocicleta(@ModelAttribute("motocicleta") Motocicleta motocicleta, Model model) {
		motocicletaService.save(motocicleta);
		return "redirect:/motocicleta/admin";
	}
	
	@GetMapping("/admin/editar/{id}")
	public String editarMotocicleta(@PathVariable("id") Long id, Model model) {
	    Optional<Motocicleta> optionalMotocicleta = motocicletaService.findById(id);
	    Motocicleta motocicleta = optionalMotocicleta.get();
	    
	    if (optionalMotocicleta.isPresent()) {
	        
	        model.addAttribute("motocicleta", motocicleta);
	        return "admin/formMotocicleta";
	    } else {
	        return "redirect:/motocicleta/admin";
	    }
	}
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarMotocicleta(@PathVariable("id") Long id, Model model) {
	    Optional<Motocicleta> optionalMotocicleta = motocicletaService.findById(id);
	    Motocicleta motocicleta = optionalMotocicleta.get();
	    
	    if (optionalMotocicleta.isPresent()) {
	    	if (ventaService.numeroDeProductoEnVenta(motocicleta) == 0) {
	    		motocicletaService.delete(motocicleta);
	    	} else {
	    	return "redirect:/motocicleta/admin/?error=true";
	    	}
	    }
	    return "redirect:/motocicleta/admin"; 
	}
}
