package com.salesianostriana.dam.concesionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Motocicleta;
import com.salesianostriana.dam.concesionario.repository.MotocicletaRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class MotocicletaService extends BaseServiceImpl<Motocicleta, Long, MotocicletaRepository>{
	
	@Autowired
	private MotocicletaRepository repository;

	@Override
	public List<Motocicleta> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Motocicleta> findById(Long id) {
		return repository.findById(id);
	}
	
	public List<Motocicleta> findByNombre(String nombre){
		return repository.findByNombreContainingIgnoreCase(nombre);
	}
	
	
	
	
}
