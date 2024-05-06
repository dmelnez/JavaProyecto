package Dtos;

import java.util.Date;

/*
 * Clase la cual contendra todos los atributos que compondran a un paciente.
 * */
public class PacienteDtos {

	String dni = "aaaaa";
	String nombre = "aaaaa";
	String apellidos = "aaaaa";
	String especialidad = "aaaaa";
	Date fechaDeCita = new Date();
	boolean asistenciaACita = false;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public Date getFechaDeCita() {
		return fechaDeCita;
	}
	public void setFechaDeCita(Date fechaDeCita) {
		this.fechaDeCita = fechaDeCita;
	}
	public boolean isAsistenciaACita() {
		return asistenciaACita;
	}
	public void setAsistenciaACita(boolean asistenciaACita) {
		this.asistenciaACita = asistenciaACita;
	}
	
	
	public PacienteDtos(String dni, String nombre, String apellidos, String especialidad, Date fechaDeCita,
			boolean asistenciaACita) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.fechaDeCita = fechaDeCita;
		this.asistenciaACita = asistenciaACita;
	}
	
	public PacienteDtos() { }


}
