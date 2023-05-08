package com.salesianostriana.dam.concesionario.model;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
	@Id
	@GeneratedValue
	@Column(name="id_cliente")//Cuando da el wrning de la tabla es porque no cioncide el nombre del atributo con el del instert into de la tabla
	private Long id;
	
	private String nombre, apellidos, email, telefono, direccion, contrasenia, municipio, dni;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="trabajador", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Venta> listaVentas = new ArrayList<>();
}
