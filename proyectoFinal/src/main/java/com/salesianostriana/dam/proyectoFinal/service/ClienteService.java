package com.salesianostriana.dam.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectoFinal.model.Cliente;
import com.salesianostriana.dam.proyectoFinal.repos.ClienteRepositorio;
import com.salesianostriana.dam.proyectoFinal.service.base.BaseServiceImpl;
//esta clase si va a tener una por entidad
@Service
public class ClienteService extends BaseServiceImpl<Cliente, Long, ClienteRepositorio>{

	@Override
	public Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Cliente save(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente edit(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	

}
