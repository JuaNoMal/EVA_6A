package com.iplacex;

import java.util.Date;

public class Persona {
	private int Rut;
	private String Nombre;
	private String Apellido;
	private int Telefono;
	private Date FechaIngreso;

	

	public Persona(int rut, String nombre, String apellido, int telefono, Date fechaIngreso) {
		super();
		Rut = rut;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		FechaIngreso = fechaIngreso;
	}

	

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Persona [Rut=" + Rut + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono
				+ ", FechaIngreso=" + FechaIngreso + "]";
	}
	
	

}
