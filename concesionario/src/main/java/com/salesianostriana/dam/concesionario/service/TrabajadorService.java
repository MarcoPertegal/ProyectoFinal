package com.salesianostriana.dam.concesionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.repository.TrabajadorRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;


@Service
public class TrabajadorService extends BaseServiceImpl<Trabajador, Long, TrabajadorRepository>{
	
	@Autowired
	private TrabajadorRepository repositorio;
	
	
	public List<Trabajador> findAll() {
		return repositorio.findAll();
	}
	
	
	public Trabajador save(Trabajador trabajador) {
		return repositorio.save(trabajador);
	}
	
	
	public Optional<Trabajador> findById(Long id) {
		return repositorio.findById(id);
	}
	
	@Override
	public void delete(Trabajador t) {
	    Optional<Trabajador> result = findById(t.getId());
	    result.ifPresent(trabajador -> repositorio.delete(trabajador));
	}
}
