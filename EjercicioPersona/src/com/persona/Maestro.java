package com.persona;

public class Maestro extends Persona {

	String clases;
	String estacionamiento;
	public Maestro(String nombre, int edad, String ApellidoMaterno, String ApellidoPaterno, String genero,
			String intereses, String Clases, String estacionamiento) {
		super(nombre, edad, ApellidoMaterno, ApellidoPaterno, genero, intereses);
		this.clases = clases;
		this.estacionamiento=estacionamiento;
		
	}

	
}
