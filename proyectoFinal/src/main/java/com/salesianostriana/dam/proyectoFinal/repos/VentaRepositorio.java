package com.salesianostriana.dam.proyectoFinal.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.proyectoFinal.model.Venta;
@Component
public interface VentaRepositorio extends JpaRepository<Venta, Long>{

}
