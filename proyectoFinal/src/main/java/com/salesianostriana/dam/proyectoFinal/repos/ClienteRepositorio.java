package com.salesianostriana.dam.proyectoFinal.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.proyectoFinal.model.Cliente;

@Component
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
