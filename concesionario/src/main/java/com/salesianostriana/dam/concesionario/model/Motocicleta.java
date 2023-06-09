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
public class Motocicleta extends Producto{
	
	private double peso, cilindrada;

	public Motocicleta(Long id, String marca, String nombre, String descripcion,
			double precioBase, String imagen, Categoria categoria, LocalDate alta, 
			List<LineaVenta> listaLineaVenta, double peso, double cilindrada) {
		super(id, marca, nombre, descripcion, imagen, precioBase, categoria, alta, listaLineaVenta);
		this.peso = peso;
		this.cilindrada = cilindrada;
	}	
}
