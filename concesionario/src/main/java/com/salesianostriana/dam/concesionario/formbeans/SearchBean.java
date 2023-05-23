package com.salesianostriana.dam.concesionario.formbeans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchBean {

	private String search;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaInicio;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;
	
	public SearchBean(){
		
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
}
