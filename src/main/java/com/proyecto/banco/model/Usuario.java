package com.proyecto.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nombre;
	private String ApellidoP;
	private String ApellidoM;
	private String telefono;
	private String correo;
	private String contraseña;
	private String PAutorizada;
	
	
	
	
	public Usuario() {
		
	}
	
	
	public Usuario(Integer id, String nombre, String apellidoP, String apellidoM, String telefono, String correo,
			String contraseña, String pAutorizada) {
		super();
		this.id = id;
		this.nombre = nombre;
		ApellidoP = apellidoP;
		ApellidoM = apellidoM;
		this.telefono = telefono;
		this.correo = correo;
		this.contraseña = contraseña;
		PAutorizada = pAutorizada;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return ApellidoP;
	}
	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}
	public String getApellidoM() {
		return ApellidoM;
	}
	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getPAutorizada() {
		return PAutorizada;
	}
	public void setPAutorizada(String pAutorizada) {
		PAutorizada = pAutorizada;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM
				+ ", telefono=" + telefono + ", correo=" + correo + ", contraseña=" + contraseña + ", PAutorizada="
				+ PAutorizada + "]";
	}
	
	

}
