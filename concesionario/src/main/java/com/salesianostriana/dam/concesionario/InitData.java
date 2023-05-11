/*
package com.salesianostriana.dam.concesionario;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Cliente;
import com.salesianostriana.dam.concesionario.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {
	
	private final ClienteRepository repo;
	private final PasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init() {
		
		Cliente cliente = Cliente.builder()
				.admin(false)
				.apellidos("Ramiro Fernandez")
				.direccion("Avenida de la Paz")
				.dni("49193684C")
				.email("fernandez@gmail.com")
				.municipio("Sevilla")
				.nombre("Francisco")
				.telefono("677552354")
				.username("user")
				//.password("1234")
				.password(passwordEncoder.encode("1234"))
				.build();
		
		Cliente admin = Cliente.builder()
				.admin(true)
				.apellidos("Prieto Sanchez")
				.direccion("Virgen de Lujan")
				.dni("49193054C")
				.email("prieto@gmail.com")
				.municipio("Sevilla")
				.nombre("Endika")
				.telefono("677554564")
				.username("admin")
				.password(passwordEncoder.encode("admin"))
				.build();
		
		repo.saveAll(List.of(cliente, admin));
		
		
	}
}
*/