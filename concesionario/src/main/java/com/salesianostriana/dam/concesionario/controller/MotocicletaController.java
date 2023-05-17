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

@Controller
@RequestMapping("/motocicleta")
public class MotocicletaController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private MotocicletaService motocicletaService;
	
	
	@GetMapping("/")//cambiar nombre
	public String motocicletaList(Model model) {
		
		model.addAttribute("listaMotocicletas", motocicletaService.findAll());

		model.addAttribute("searchForm", new SearchBean());
		return "motocicletas";//cambiar nombre
	}
	
	@PostMapping("/search")//cambiar nombre
	  public String searchMotocicleta(@ModelAttribute("searchForm") SearchBean searchBean,
			 Model model){
	  	model.addAttribute("motocicletas", motocicletaService.findByNombre(searchBean.getSearch()));
	  
	  return "list";//cambiar nombre
	  }
	
	//METODOS PARA ADMIN
	//hay que añadir un enum para las categorias, (mirar ejemplo formularios)
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
	    	motocicletaService.delete(motocicleta);
	    }
	    
	    return "redirect:/motocicleta/admin";
	    
	}
}
