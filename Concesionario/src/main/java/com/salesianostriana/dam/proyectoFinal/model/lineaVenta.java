package com.salesianostriana.dam.proyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class lineaVenta {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private double pvp;
	private int cantidad;
	
	@ManyToOne
	private Venta venta;
}
