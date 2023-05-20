package com.salesianostriana.dam.concesionario.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.salesianostriana.dam.concesionario.model.LineaVenta;
import com.salesianostriana.dam.concesionario.model.Producto;
import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.model.Venta;
import com.salesianostriana.dam.concesionario.repository.ProductoRepository;
import com.salesianostriana.dam.concesionario.repository.VentaRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
@Scope (value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class VentaService extends BaseServiceImpl<Venta, Long, VentaRepository>{
	
	@Autowired
	private VentaRepository repositorio;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	private Map<Producto, Integer> listaLineaVentas = new HashMap <>();
	
	@Autowired
	public VentaService (ProductoRepository productorepository) {
		this.productoRepository=productorepository;
	}

	public int numeroVentasTrabajador(Trabajador trabajador) {
		return repositorio.findNumTrabajadoresByVenta(trabajador);
	}
	
	public void addProducto(Optional<Producto> producto) {
	    if (producto.isPresent()) {
	        Producto p = producto.get();
	        if (listaLineaVentas.containsKey(p)) {
	            listaLineaVentas.replace(p, listaLineaVentas.get(p) + 1);
	        } else {
	            listaLineaVentas.put(p, 1);
	        }
	    }
	}
	
	public void removeProducto(Optional<Producto> producto) {
	    if (producto.isPresent() && listaLineaVentas.containsKey(producto.get())) {
	        if (listaLineaVentas.get(producto.get()) > 1) {
	            listaLineaVentas.replace(producto.get(), listaLineaVentas.get(producto.get()) - 1);
	        } else if (listaLineaVentas.get(producto.get()) == 1) {
	            listaLineaVentas.remove(producto.get());
	        }
	    }
	}
	
	
	public Map<Producto, Integer> getProductsInCart() {
        return Collections.unmodifiableMap(listaLineaVentas);
    }
	
	public void SetCarrito() {
	    Venta v = new Venta();
	    for (Producto p : listaLineaVentas.keySet()) {
	        v.addLineaVenta(
	        	LineaVenta.builder()
	        		.producto(p)
	        		.cantidad(listaLineaVentas.get(p))
	        		.build()
	        );

	    }
	    v.setFecha(LocalDate.now());
	    v.setTotal(0);
	    save(v);
	    
	    listaLineaVentas.clear();
	}
	

}
