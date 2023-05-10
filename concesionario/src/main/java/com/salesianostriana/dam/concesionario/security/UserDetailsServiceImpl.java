package com.salesianostriana.dam.concesionario.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.concesionario.repository.UsuarioRepository;
import com.salesianostriana.dam.concesionario.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{
	
		/*private final UsuarioRepository repo;
		
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			return repo.findFirstByUsername(username)
					.orElseThrow(()-> new UsernameNotFoundException("Error al buscar el usuario"));
		}*/
		
		private final UsuarioService usuarioServicio;
		
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			return usuarioServicio.buscarPorEmail(username)
					.orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
		}
	
}
