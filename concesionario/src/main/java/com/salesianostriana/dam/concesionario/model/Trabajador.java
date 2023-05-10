package com.salesianostriana.dam.concesionario.model;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "TRABAJADOR")
public class Trabajador {
	@Id
	@GeneratedValue
	@Column(name="ID_TRABAJADOR")
	private Long id;
	
	private String nombre, apellidos, dni, direccion, municipio, telefono;//preguntar si telefono es int o String pq en la base de datos es un char
	private double sueldo;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="trabajador", fetch = FetchType.EAGER)//mapped by hace que la relación sea bidireccional con la tabala especificda
	@Builder.Default
	private List<Venta> listaVentas = new ArrayList<>();
}
