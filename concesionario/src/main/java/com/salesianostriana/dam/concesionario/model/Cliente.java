package com.salesianostriana.dam.concesionario.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
public class Cliente implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre, apellidos, email, telefono, direccion, municipio, dni, username, password;
	
	private boolean admin;
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="cliente", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Venta> listaVentas = new ArrayList<>();
	
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = "ROLE_";
		role += (admin) ? "ADMIN" : "USER";
		return List.of(new SimpleGrantedAuthority(role));
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
}
