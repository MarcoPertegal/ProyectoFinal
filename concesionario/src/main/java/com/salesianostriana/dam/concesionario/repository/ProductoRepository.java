package com.salesianostriana.dam.concesionario.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.concesionario.model.Producto;

@Component
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	@Query("select p from Producto p where TYPE(p) = Producto")
	public List<Producto> Productos();
}
