package com.salesianostriana.dam.concesionario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.model.Venta;

@Component
public interface VentaRepository extends JpaRepository<Venta, Long> {
	@Query("select v.id from Venta v")
	public List<Long> obtenerIds();
	
	@Query("select count(v) from Venta v where v.trabajador = ?1")
	public int findNumTrabajadoresByVenta(Trabajador trabajador);
}
