package com.salesianostriana.dam.proyectoFinal.service.base;

import java.util.List;

//esta tampco se repite
public interface BaseService <T, ID>{
	
	List <T> findAll();
}
