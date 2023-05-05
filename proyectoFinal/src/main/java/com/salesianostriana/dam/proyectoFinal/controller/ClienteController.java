package com.salesianostriana.dam.proyectoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.proyectoFinal.service.ClienteService;

@Controller
public class ClienteController {
	//Problema porque a Ángel añade los objetos desde service y luismi desde el main de mentira, ¿como se haría realmente?
	//es indifere donde hacerlo en la realidad se sacan los datos de la base de datos 
	
	private ClienteService clienteService;
	
	//aqui en su ejemplo coge la lista de la clase servicio como yo 
	//Hacer lo de composición y la clase linea de venta con articulo
	@GetMapping("/cliente")
	public String lista (Model model) {
		model.addAttribute("cliente", clienteService.findAll());
		return "listaPrueba";
	}
	
}
