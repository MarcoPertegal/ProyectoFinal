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
import com.salesianostriana.dam.concesionario.model.Accesorio;
import com.salesianostriana.dam.concesionario.service.AccesorioService;
import com.salesianostriana.dam.concesionario.service.VentaService;

@Controller
@RequestMapping("/accesorio")
public class AccesorioController {
	
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private AccesorioService accesorioService;
	
	@Autowired
	private VentaService ventaService;
	
	
	@GetMapping("/")
	public String accesorioList(Model model) {		
		model.addAttribute("listaAccesorios", accesorioService.findAll());
		model.addAttribute("searchForm", new SearchBean());
		return "accesorios";
	}
	
	@PostMapping("/search")
	public String searchAccesorio(@ModelAttribute("searchForm") SearchBean searchBean, Model model){
	  	model.addAttribute("listaAccesorios", accesorioService.findByNombre(searchBean.getSearch()));
	  	return "accesorios-lista";
	}
	
	@GetMapping("/admin")
	public String listAccesorio(Model model) {
		model.addAttribute("listaAccesorios", accesorioService.findAll());
		return "admin/listAccesorio";
	}
	
	@GetMapping("/admin/nuevo")
	public String nuevoAccesorio(Model model) {
		model.addAttribute("accesorio", new Accesorio());
		return "admin/formAccesorio";
	}
	
	@PostMapping("/admin/nuevo/submit")
	public String submitNuevoAccesorio(@ModelAttribute("accesorio") Accesorio accesorio, Model model) {
		accesorioService.save(accesorio);
		return "redirect:/accesorio/admin";
	}
	
	@GetMapping("/admin/editar/{id}")
	public String editarAccesorio(@PathVariable("id") Long id, Model model) {
	    Optional<Accesorio> optionalAccesorio = accesorioService.findById(id);
	    Accesorio accesorio = optionalAccesorio.get();
	    
	    if (optionalAccesorio.isPresent()) {
	        
	        model.addAttribute("accesorio", accesorio);
	        return "admin/formAccesorio";
	    } else {
	        return "redirect:/accesorio/admin";
	    }
	}
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarAccesorio(@PathVariable("id") Long id, Model model) {
	    Optional<Accesorio> optionalAccesorio = accesorioService.findById(id);
	    Accesorio accesorio = optionalAccesorio.get();
	    
	    if (optionalAccesorio.isPresent()) {
	    	if (ventaService.numeroDeProductoEnVenta(accesorio) == 0) {
		        accesorioService.delete(accesorio);
	    	} else {
	    		return "redirect:/accesorio/admin/?error=true";
	    	}
	    }
	    return "redirect:/accesorio/admin";
	}
	   
}
