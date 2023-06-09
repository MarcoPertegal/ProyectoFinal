package com.salesianostriana.dam.concesionario.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

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
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	private double total;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name= "fk_venta_cliente"))
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name= "fk_venta_trabajador"))
	private Trabajador trabajador;
	
	public void addToCliente(Cliente cliente) {
		this.cliente = cliente;
		cliente.getListaVentas().add(this);
	}
	
	public void removeFromCliente(Cliente cliente) {
		cliente.getListaVentas().remove(this);
		this.cliente = null;
	}
	
	public void addToTrabajdor(Trabajador trabajador) {
		this.trabajador = trabajador;
		trabajador.getListaVentas().add(this);
	}
		
	public void removeFromTrabajador(Trabajador trabajador) {
		trabajador.getListaVentas().remove(this);
		this.trabajador = null;		
	}
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@Builder.Default
	@OneToMany(
				mappedBy = "venta",
				fetch = FetchType.EAGER,
				cascade = CascadeType.ALL,
				orphanRemoval = true
		)
	private List<LineaVenta> listaLineaVenta = new ArrayList<>();
		
	public void addLineaVenta(LineaVenta lV) {
		lV.setVenta(this);
		this.listaLineaVenta.add(lV);
	}
	
	public void removeLineaVenta(LineaVenta lV) {
		this.listaLineaVenta.remove(lV);
		
	}
}
