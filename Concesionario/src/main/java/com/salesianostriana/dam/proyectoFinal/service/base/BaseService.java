package com.salesianostriana.dam.proyectoFinal.service.base;

import java.util.List;
import java.util.Optional;

//esta tampco se repite
public interface BaseService <T, ID>{
	
	List<T> findAll();
	
	Optional<T> findById(ID id);
	
	T save(T t);
	
	T edit(T t);
	
	void delete(T t);
	
	void deleteById(ID id);
}
