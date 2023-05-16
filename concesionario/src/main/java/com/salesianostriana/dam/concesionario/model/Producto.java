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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	
	//HE QUITADO LA ANOTACIÓN BUILDER Y BUILDER DEFAULT DE PRODUCTO Y SE LO HE PUESTO A MOTO, ¿ESTA BIEN?
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	protected String marca, nombre, categoria, descripcion, precioBase;
	protected String imagen;
	
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="producto", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LineaVenta> listaLineaVenta = new ArrayList<>();
	
}
