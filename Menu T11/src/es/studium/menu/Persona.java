package es.studium.menu;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Persona implements Comparable {
	private String nombre; 
	private String telefono;
	private String correo; 
	public String toString() {
		return this.telefono + " " + this.nombre + " " + this.correo;
	}
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.telefono = apellidos;
		this.correo = dni;
	} public String getApellidos() { 
		return telefono; 
	}
	public void setApellidos(String apellidos) {
		this.telefono = apellidos;
	} 
	public String getDni() { 
		return correo;
	} 
	public void setDni(String dni) {
		this.correo = dni; 
	} 
	public String getNombre(){ return nombre;
	} 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	public int compareTo(Object o) {
		Persona persona = (Persona)o;
		if(this.telefono.compareToIgnoreCase(persona.telefono) == 0) {
			if(this.nombre.compareToIgnoreCase(persona.nombre) == 0) {
				return this.correo.compareTo(persona.correo);
			}else {
				return this.nombre.compareToIgnoreCase(persona.nombre); 
			} 
		} else {
			return this.telefono.compareToIgnoreCase(persona.telefono); 
		}
	}
}