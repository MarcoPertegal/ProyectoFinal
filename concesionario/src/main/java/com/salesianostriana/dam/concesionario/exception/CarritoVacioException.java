package com.salesianostriana.dam.concesionario.exception;

public class CarritoVacioException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarritoVacioException () {
		
	}
	
	public CarritoVacioException (String mensaje) {
		
		super ("No ha comprado ningún producto todavía");
	}
}
