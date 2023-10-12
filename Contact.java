package com.example.demo;

public class Contact {
	private String nombre;
	private String calle;
	private int numero;
	private String correo;
	
	Contact(String nombre, String calle, int numero, String correo){
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
}
