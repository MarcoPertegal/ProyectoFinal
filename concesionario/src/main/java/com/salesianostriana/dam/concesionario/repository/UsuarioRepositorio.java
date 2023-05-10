package com.salesianostriana.dam.concesionario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Usuario;

@Component
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findFirstByUsername(String username);

}
