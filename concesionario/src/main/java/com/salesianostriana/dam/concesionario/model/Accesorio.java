package com.salesianostriana.dam.concesionario.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Accesorio extends Producto{
	
	private String caracteristicas;

	public Accesorio(Long id, String marca, String nombre, String categoria, String descripcion, String precioBase,
			String imagen, List<LineaVenta> listaLineaVenta, String caracteristicas, LocalDate alta) {
		super(id, marca, nombre, categoria, descripcion, precioBase, imagen, alta, listaLineaVenta);
		this.caracteristicas = caracteristicas;
	}
	
	
}
