package com.salesianostriana.dam.concesionario.repository;

import java.time.LocalDate;
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
	
	 @Query("SELECT v FROM Venta v WHERE v.fecha BETWEEN ?1 AND ?2")
	 public List<Venta> findVentasByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);
}
