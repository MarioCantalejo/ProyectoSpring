package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patron {
	@Id
	private int id_patron;
	private String nombre_pat;
	private String apellido_pat;
	private int telefono_pat;
	public int getId_patron() {
		return id_patron;
	}
	public void setId_patron(int id_patron) {
		this.id_patron = id_patron;
	}
	public String getNombre_pat() {
		return nombre_pat;
	}
	public void setNombre_pat(String nombre_pat) {
		this.nombre_pat = nombre_pat;
	}
	public String getApellido_pat() {
		return apellido_pat;
	}
	public void setApellido_pat(String apellido_pat) {
		this.apellido_pat = apellido_pat;
	}
	public int getTelefono_pat() {
		return telefono_pat;
	}
	public void setTelefono_pat(int telefono_pat) {
		this.telefono_pat = telefono_pat;
	}
	
}
