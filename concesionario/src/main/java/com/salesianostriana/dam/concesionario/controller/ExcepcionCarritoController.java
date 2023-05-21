package com.salesianostriana.dam.concesionario.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.salesianostriana.dam.concesionario.exception.CarritoVacioException;

@ControllerAdvice
public class ExcepcionCarritoController {
	
	@ExceptionHandler (CarritoVacioException.class)	
	public String excepcioncarrito (Model model, CarritoVacioException ecv) {
		
		model.addAttribute("excep", ecv);
		return "errorcarritovacio";
	}
}
