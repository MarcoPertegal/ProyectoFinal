package com.salesianostriana.dam.concesionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Cliente;
import com.salesianostriana.dam.concesionario.repository.ClienteRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class ClienteService extends BaseServiceImpl<Cliente, Long, ClienteRepository> {
	
	@Autowired
	private ClienteRepository repositorio;
	
	public List<Cliente> findAll() {
		return repositorio.findAll();
	}
}
