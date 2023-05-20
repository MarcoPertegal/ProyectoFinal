package com.salesianostriana.dam.concesionario.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Producto;
import com.salesianostriana.dam.concesionario.repository.ProductoRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class ProductoService extends BaseServiceImpl<Producto, Long, ProductoRepository>{
	
	@Override
	public Optional<Producto> findById(Long id) {
		return repository.findById(id);
	}
}
