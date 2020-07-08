package edu.ucsur.munayi.model;

public class Usuario {
	private String nombre;
	private int dni;
	private String correo;
	private int edad;
	private String sexo;
	public Usuario() {
		super();
	}
	public Usuario(String nombre, int dni, String correo, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.correo = correo;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
