package com.salesianostriana.dam.concesionario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "LINEAVENTA")
public class LineaVenta {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_LINEA_VENTA")
	private Long id;
	
	private double pvp;
	private int cantidad;
	
	@ManyToOne
	private Venta venta;
}
