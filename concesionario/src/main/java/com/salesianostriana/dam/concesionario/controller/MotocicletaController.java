package com.salesianostriana.dam.concesionario.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.concesionario.formbeans.SearchBean;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;

@Controller
@RequestMapping("/motocicleta")
public class MotocicletaController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private MotocicletaService motocicletaService;
	
	@GetMapping("/")
	public String motocicletaList1(Model model) {
		
		model.addAttribute("motocicletas", motocicletaService.findAll());
		return "motocicletas";
	}
	
	
	@GetMapping("/list")//cambiar nombre
	public String motocicletaList(Model model) {
		
		model.addAttribute("motocicletas", motocicletaService.findAll());

		model.addAttribute("searchForm", new SearchBean());
		return "motocicletas";//cambiar nombre
	}
	
	@PostMapping("/search")//cambiar nombre
	  public String searchMotocicleta(@ModelAttribute("searchForm") SearchBean searchBean,
			 Model model){
	  	model.addAttribute("motocicletas", motocicletaService.findByNombre(searchBean.getSearch()));
	  
	  return "list";//cambiar nombre
	  }
	
	@GetMapping("/admin/motocicleta/")
	public String listMotocicleta(Model model) {
		model.addAttribute("listaMotocicletas", motocicletaService.findAll());
		return "admin/listMotocicleta";
	}
}
