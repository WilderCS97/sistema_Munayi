package edu.ucsur.munayi.model;

public class Receta {
	private String medicamento;
	private int cantidad;
	private String dosis;
	
	public Receta() {
		super();
	}

	public Receta(String medicamento, int cantidad, String dosis) {
		super();
		this.medicamento = medicamento;
		this.cantidad = cantidad;
		this.dosis = dosis;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	
}
