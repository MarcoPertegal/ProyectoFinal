package com.salesianostriana.dam.concesionario.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	
	protected String marca, nombre, descripcion, precioBase;
	protected String imagen;
	
	@Enumerated(EnumType.STRING)
	Categoria categoria;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate alta;
	
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="producto", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LineaVenta> listaLineaVenta = new ArrayList<>();
	
}
