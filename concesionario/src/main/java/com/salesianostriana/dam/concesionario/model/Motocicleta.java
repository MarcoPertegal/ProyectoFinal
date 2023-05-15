package com.salesianostriana.dam.concesionario.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Motocicleta extends Producto{
	
	private double peso, cilindrada;
	
	public Motocicleta(Long id, String marca, String nombre, String categoria, String descripcion, String precioBase,
			List<LineaVenta> listaLineaVenta, double peso, double cilindrada) {
		super(id, marca, nombre, categoria, descripcion, precioBase, listaLineaVenta);
		this.peso = peso;
		this.cilindrada = cilindrada;
	}

	
	
}
