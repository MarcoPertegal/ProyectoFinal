package com.salesianostriana.dam.concesionario.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.model.Trabajador;
import com.salesianostriana.dam.concesionario.model.Usuario;
import com.salesianostriana.dam.concesionario.repository.TrabajadorRepository;
import com.salesianostriana.dam.concesionario.repository.UsuarioRepository;
import com.salesianostriana.dam.concesionario.service.base.BaseServiceImpl;

@Service
public class UsuarioService extends BaseServiceImpl<Usuario, Long, UsuarioRepository>{

}
