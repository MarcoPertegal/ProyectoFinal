package com.salesianostriana.dam.concesionario.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.salesianostriana.dam.concesionario.model.Producto;
import com.salesianostriana.dam.concesionario.repository.ProductoRepository;

@Service
@Scope (value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CarritoService {
	
	private ProductoRepository productoRepository;
	
	private Map<Producto, Integer> listaProductos = new HashMap <> ();
	
	@Autowired
	public CarritoService (ProductoRepository productorepository) {
		this.productoRepository=productorepository;
	}
	
	public void addProducto (Producto p) {
		if (listaProductos.containsKey(p)) {
			listaProductos.replace(p, listaProductos.get(p)+1);
		}else {
			listaProductos.put(p, 1);
		}
	}
	
	public void removeProducto (Producto p) {
        if (listaProductos.containsKey(p)) {
            if (listaProductos.get(p) > 1)
            	listaProductos.replace(p, listaProductos.get(p) - 1);
            else if (listaProductos.get(p) == 1) {
            	listaProductos.remove(p);
            }
        }
	}
	
	public Map<Producto, Integer> getProductsInCart() {
        return Collections.unmodifiableMap(listaProductos);
    }
	
}
