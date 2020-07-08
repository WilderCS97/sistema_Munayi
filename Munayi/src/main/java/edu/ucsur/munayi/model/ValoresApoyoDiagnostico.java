package edu.ucsur.munayi.model;

public class ValoresApoyoDiagnostico {
	private int presion;
	private int temperatura;
	private int edad;
	private int peso;
	
	public ValoresApoyoDiagnostico() {
		super();
	}
	public ValoresApoyoDiagnostico(int presion, int temperatura, int edad, int peso) {
		super();
		this.presion = presion;
		this.temperatura = temperatura;
		this.edad = edad;
		this.peso = peso;
	}
	public int getPresion() {
		return presion;
	}
	public void setPresion(int presion) {
		this.presion = presion;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
