package com.salesianostriana.dam.concesionario.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@NoArgsConstructor
@Table(name = "TRABAJADOR")
public class Trabajador extends Usuario{
	
	private double sueldo;
	
	public Trabajador(Long id, String password, String nombre, String apellidos, String dni, String direccion,
			String municipo, String telefono, String email, boolean admin, double sueldo, List<Venta> listaVentas) {
		super(id, password, nombre, apellidos, dni, direccion, municipo, telefono, email, admin);
		this.sueldo = sueldo;
		this.listaVentas = listaVentas;
	}
	
	
	//HE tenido que meter esto porque sino peta la anotación
	private static List<Venta> $default$listaVentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}


	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="trabajador", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)//mapped by hace que la relación sea bidireccional con la tabala especificda
	@Builder.Default
	private List<Venta> listaVentas = new ArrayList<>();
}
