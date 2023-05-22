package com.salesianostriana.dam.concesionario.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.concesionario.exception.CarritoVacioException;
import com.salesianostriana.dam.concesionario.formbeans.SearchBean;
import com.salesianostriana.dam.concesionario.model.Cliente;
import com.salesianostriana.dam.concesionario.model.Venta;
import com.salesianostriana.dam.concesionario.service.AccesorioService;
import com.salesianostriana.dam.concesionario.service.MotocicletaService;
import com.salesianostriana.dam.concesionario.service.ProductoService;
import com.salesianostriana.dam.concesionario.service.VentaService;


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
		if (ventaService.getProductsInCart().isEmpty()) {
			throw new CarritoVacioException ("Carrito vacío");
		}else {
			model.addAttribute("productos", ventaService.getProductsInCart());
			return "carrito";
		}
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
	public Double mostrartotalCarrito () {
	    	
		return ventaService.totalCarrito();
	}
	
	@PostMapping("/carrito/finalizarCompra")
	public String finalizarCompra(@AuthenticationPrincipal Cliente cliente) {
		ventaService.crearVenta(cliente);
		return "compraFinalizada";
	}
	
	@GetMapping("/admin/venta")
	public String listVenta(Model model) {
		model.addAttribute("listaVentas", ventaService.findAll());
		model.addAttribute("searchForm", new SearchBean());
		return "admin/listVenta";
	}
	
	@PostMapping("/admin/venta/search")
	public String searchVenta(@ModelAttribute("searchForm") SearchBean searchBean, Model model) {
	    LocalDate fechaInicio = searchBean.getFechaInicio();
	    LocalDate fechaFin = searchBean.getFechaFin();

	    searchBean.setFechaInicio(fechaInicio);
	    searchBean.setFechaFin(fechaFin);

	    List<Venta> ventas = ventaService.findByFechaBetween(fechaInicio, fechaFin);
	    model.addAttribute("listaVentas", ventas);

	    return "admin/listVenta";
	}
	 
}
