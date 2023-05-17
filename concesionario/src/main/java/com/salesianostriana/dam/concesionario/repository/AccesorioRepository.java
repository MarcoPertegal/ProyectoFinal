package com.salesianostriana.dam.concesionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Accesorio;

@Component
public interface AccesorioRepository extends JpaRepository<Accesorio, Long>{
	
}
