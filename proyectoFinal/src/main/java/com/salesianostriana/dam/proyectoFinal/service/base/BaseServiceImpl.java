package com.salesianostriana.dam.proyectoFinal.service.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseServiceImpl<T, ID, R extends JpaRepository<T, ID>> implements BaseService<T, ID> {
	
	protected R repository;
	
	@Override
	public List<T> findAll() {
		return repository.findAll();
	}
}
