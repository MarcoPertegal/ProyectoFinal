package com.salesianostriana.dam.concesionario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Motocicleta;

@Component
public interface MotocicletaRepository extends JpaRepository<Motocicleta, Long>{
	
	public  List<Motocicleta> findByNombreContainingIgnoreCase(String nombre);
	
}
