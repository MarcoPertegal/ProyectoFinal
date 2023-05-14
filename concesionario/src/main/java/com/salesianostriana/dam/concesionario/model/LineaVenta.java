package com.salesianostriana.dam.concesionario.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class LineaVenta {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private double pvp;
	private int cantidad;
	
	@ManyToOne
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_linea_venta_producto"))
	private Producto producto;
	
	public void addToProducto(Producto producto) {
		this.producto = producto;
		producto.getListaLineaVenta().add(this);
	}
	
	public void removeFromProducto(Producto producto) {
		producto.getListaLineaVenta().remove(this);
		this.producto = null;
	}
}
