package edu.ucsur.munayi.model;

import java.util.Date;

public class Horario {
	private Date fecha;
	private String hora;
	
	public Horario() {
		super();
	}

	public Horario(Date fecha, String hora) {
		super();
		this.fecha = fecha;
		this.hora = hora;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
