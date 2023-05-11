package com.salesianostriana.dam.concesionario.service;

import java.util.List;

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
}
