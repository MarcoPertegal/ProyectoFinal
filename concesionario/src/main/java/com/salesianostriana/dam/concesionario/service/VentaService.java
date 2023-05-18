package com.salesianostriana.dam.concesionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.model.Venta;
import com.salesianostriana.dam.concesionario.repository.VentaRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class VentaService extends BaseServiceImpl<Venta, Long, VentaRepository>{
	
	@Autowired
	private VentaRepository repositorio;

	public int numeroVentasTrabajador(Trabajador trabajador) {
		return repositorio.findNumTrabajadoresByVenta(trabajador);
	}

}
