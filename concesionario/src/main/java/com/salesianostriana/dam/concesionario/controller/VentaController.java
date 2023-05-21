package com.salesianostriana.dam.concesionario.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.concesionario.service.AccesorioService;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;
import com.salesianostriana.dam.concesionario.service.ProductoService;
import com.salesianostriana.dam.concesionario.service.VentaService;
import com.salesianostriana.dam.concesionario.exception.CarritoVacioException;
import com.salesianostriana.dam.concesionario.model.Producto;


@Controller
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
    public VentaController(VentaService ventaService, MotocicletaService motocicletaService, AccesorioService accesorioService) {
        this.ventaService = ventaService;
        this.productoService = productoService;
    }
	
	@GetMapping ("/carrito")
	public String mostrarCarrito(Model model) throws CarritoVacioException {
		if (ventaService.getProductsInCart().isEmpty()) 
			throw new CarritoVacioException ("Carrito vacío");
		else 
			model.addAttribute("productos", ventaService.getProductsInCart());
			return "carrito";
	}
	
	@GetMapping ("/productoACarrito/{id}")
	public String productoACarrito (@PathVariable("id") Long id, Model model) {
	    	
		ventaService.addProducto(productoService.findById(id));	 		 	
		return "redirect:/carrito";
	}
	 
	@GetMapping("/borrarProducto/{id}")
	public String removeProductFromCart(@PathVariable("id") Long id) {
	        
		ventaService.removeProducto(productoService.findById(id));
		return "redirect:/carrito";
	}
	 
	@ModelAttribute("total_carrito")
	public Double totalCarrito () {
	    	
		Map <Producto,Integer> carrito=ventaService.getProductsInCart();
	    double total=0.0;
	    if (carrito !=null) {
	        for (Producto p: carrito.keySet()) {
	        	total+=p.getPrecioBase()*carrito.get(p);
	        }
	        return total;
	    }
	    return 0.0;
	}

	 
}
