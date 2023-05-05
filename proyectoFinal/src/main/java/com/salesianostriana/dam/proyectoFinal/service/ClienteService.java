package com.salesianostriana.dam.proyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectoFinal.model.Cliente;
import com.salesianostriana.dam.proyectoFinal.repos.ClienteRepositorio;
import com.salesianostriana.dam.proyectoFinal.service.base.BaseServiceImpl;
//esta clase si va a tener una por entidad
@Service
public class ClienteService extends BaseServiceImpl<Cliente, Long, ClienteRepositorio>{

}
