package com.salesianostriana.dam.concesionario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Cliente;

@Component
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Optional<Cliente> findFirstByUsername(String username);
}
