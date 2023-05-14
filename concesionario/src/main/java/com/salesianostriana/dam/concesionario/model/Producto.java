package com.salesianostriana.dam.concesionario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String marca, nombre, categoria, descripcion, precioBase;
	
}
