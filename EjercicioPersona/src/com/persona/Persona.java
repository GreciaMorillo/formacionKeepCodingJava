package com.persona;

public class Persona {
	 private String nombre;
	 private String ApellidoMaterno;
	 private String ApellidoPaterno;
	 private int edad;
	 private String genero;
	 private String intereses;
	 
	 public Persona(String nombre,int edad, String ApellidoMaterno,
			 String ApellidoPaterno, String genero, String intereses) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.ApellidoMaterno= ApellidoMaterno;
		 this.ApellidoPaterno = ApellidoPaterno;
		 this.genero = genero;
		 this.intereses = intereses; 
	 }
	 
	 public String mostrarDatos() {
		 return "Nombre:"+this.nombre+"\n"+
	 "ApellidoPaterno:"+this.ApellidoPaterno+"\n"+
				"ApellidoMaterno:"+this.ApellidoMaterno+"\n"+
	 "Edad: "+this.edad+"\n"+ "Género: "+this.genero+"\n"+"Intereses: "+this.intereses;
	 }
	 
	}

