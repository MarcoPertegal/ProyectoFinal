package com.salesianostriana.dam.concesionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Accesorio;
import com.salesianostriana.dam.concesionario.repository.AccesorioRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class AccesorioService extends BaseServiceImpl<Accesorio, Long, AccesorioRepository>{
	
	@Autowired
	private AccesorioRepository repositorio;

	@Override
	public List<Accesorio> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Accesorio> findById(Long id) {
		return repository.findById(id);
	}
	
	public List<Accesorio> findByNombre(String nombre){
		return repository.findByNombreContainingIgnoreCase(nombre);
	}
	
	public Accesorio save(Accesorio accesorio) {
		return repositorio.save(accesorio);
	}
	
	@Override
	public void delete(Accesorio a) {
	    Optional<Accesorio> result = findById(a.getId());
	    result.ifPresent(accesorio -> repositorio.delete(accesorio));
	}
	
	
}
