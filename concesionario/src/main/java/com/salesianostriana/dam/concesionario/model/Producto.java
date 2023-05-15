package com.salesianostriana.dam.concesionario.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
public abstract class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String marca, nombre, categoria, descripcion, precioBase;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="producto", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@Builder.Default
	private List<LineaVenta> listaLineaVenta = new ArrayList<>();
	
}
