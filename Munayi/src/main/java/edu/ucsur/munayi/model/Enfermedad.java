package edu.ucsur.munayi.model;

import java.util.Date;

public class Enfermedad {
	protected String nombreEnfermedad;
	protected Date fechaContagio;
	
	public Enfermedad() {
		super();
	}

	public Enfermedad(String nombreEnfermedad, Date fechaContagio) {
		super();
		this.nombreEnfermedad = nombreEnfermedad;
		this.fechaContagio = fechaContagio;
	}
	
}
