package com.salesianostriana.dam.concesionario.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trabajador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre, apellidos, dni, direccion, municipio, telefono;//preguntar si telefono es int o String pq en la base de datos es un char
	private double sueldo;
	
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="trabajador", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Venta> listaVentas = new ArrayList<>();
	
	
	
	
}
