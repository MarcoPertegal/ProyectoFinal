package com.salesianostriana.dam.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectoFinal.model.Trabajador;
import com.salesianostriana.dam.proyectoFinal.repos.TrabajadorRepositorio;
import com.salesianostriana.dam.proyectoFinal.service.base.BaseServiceImpl;

@Service
public class TrabajadorService extends BaseServiceImpl<Trabajador, Long, TrabajadorRepositorio>{

	@Override
	public List<Trabajador> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Optional<Trabajador> findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Trabajador save(Trabajador t) {
		// TODO Auto-generated method stub
		return super.save(t);
	}

	@Override
	public Trabajador edit(Trabajador t) {
		// TODO Auto-generated method stub
		return super.edit(t);
	}

	@Override
	public void delete(Trabajador t) {
		// TODO Auto-generated method stub
		super.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
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
