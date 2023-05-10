package com.salesianostriana.dam.concesionario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario implements UserDetails {
	
	private static final long serialVersionUID = 1409538586158223652L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String password, nombre, apellidos, dni, direccion, municipo, telefono;
	
	@Column(unique = true)
	private String email;
	
	private boolean admin;
	
	public Usuario(Long id, String password, String nombre, String apellidos, String dni, String direccion,
			String municipo, String telefono, String email, boolean admin) {
		super();
		this.id = id;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.municipo = municipo;
		this.telefono = telefono;
		this.email = email;
		this.admin = admin;
	}
	
	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	/*
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = "ROLE_";
		role += (admin) ? "ADMIN" : "USER";
		return List.of(new SimpleGrantedAuthority(role));
	}	*/


	

}
