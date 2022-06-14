package com.persona;

public class Alumno extends Persona{
    private String ClasesAtomar;
    private String grupo;
	public Alumno(String nombre, int edad, String ApellidoMaterno, String ApellidoPaterno, String genero,
			String intereses, String ClasesAtomar, String grupo) {
		super(nombre, edad, ApellidoMaterno, ApellidoPaterno, genero, intereses);
		this.ClasesAtomar=ClasesAtomar;
		this.grupo=grupo;
	}

}
