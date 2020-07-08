package edu.ucsur.munayi.model;

import java.util.Date;

public class AlertaMedicamento {
	private Date fechaAler;
	private String horaAler;
	
	public AlertaMedicamento() {
		super();
	}

	public AlertaMedicamento(Date fechaAler, String horaAler) {
		super();
		this.fechaAler = fechaAler;
		this.horaAler = horaAler;
	}

	public Date getFechaAler() {
		return fechaAler;
	}

	public void setFechaAler(Date fechaAler) {
		this.fechaAler = fechaAler;
	}

	public String getHoraAler() {
		return horaAler;
	}

	public void setHoraAler(String horaAler) {
		this.horaAler = horaAler;
	}
	
	
}
