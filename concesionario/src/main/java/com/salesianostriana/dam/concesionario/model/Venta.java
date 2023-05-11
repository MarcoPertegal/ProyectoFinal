package com.salesianostriana.dam.concesionario.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

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
@Table(name = "VENTA")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ID_VENTA")
	private Long id;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime fecha;
	
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name= "fk_venta_trabajador"))
	private Trabajador trabajador;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name= "fk_venta_cliente"))
	private Cliente cliente;
	
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
		
		///CON CLIENTE
	public void addToCliente(Cliente cliente) {
		this.cliente = cliente;
		cliente.getListaVentas().add(this);
	}
		
	public void removeFromCliente(Cliente cliente) {
		cliente.getListaVentas().remove(this);
		this.cliente = null;
	}
	
	//COn trabajador
	public void addToTrabajador(Trabajador trabajador) {
		this.trabajador= trabajador;
		trabajador.getListaVentas().add(this);
	}
		
	public void removeFromTrabajador(Trabajador trabajador) {
		trabajador.getListaVentas().remove(this);
		this.trabajador = null;
	}
	
	//Metodos Helper asociación de composición lineaVenta y venta
	public void addLineaVenta(LineaVenta lV) {
		lV.setVenta(this);
		this.listaLineaVenta.add(lV);
	}
	
	public void removeAsiento(LineaVenta lV) {
		this.listaLineaVenta.remove(lV);
		lV.setVenta(null);
		
	}
}
