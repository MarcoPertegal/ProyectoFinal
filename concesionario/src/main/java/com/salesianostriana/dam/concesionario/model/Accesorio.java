package com.salesianostriana.dam.concesionario.model;

import java.util.List;

import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Accesorio extends Producto{
	
	private String caracteristicas;

	public Accesorio(Long id, String marca, String nombre, String categoria, String descripcion, String precioBase,
			String imagen, List<LineaVenta> listaLineaVenta, String caracteristicas) {
		super(id, marca, nombre, categoria, descripcion, precioBase, imagen, listaLineaVenta);
		this.caracteristicas = caracteristicas;
	}
	
	
}
