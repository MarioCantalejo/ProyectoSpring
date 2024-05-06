package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Barco {
	@Id
	private int id_barco;
	private int id_socio;
	private String num_matricula;
	private String nombre_barco;
	private int num_amarre;
	
	public int getId_barco() {
		return id_barco;
	}
	public void setId_barco(int id_barco) {
		this.id_barco = id_barco;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public String getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
	}
	public String getNombre_barco() {
		return nombre_barco;
	}
	public void setNombre_barco(String nombre_barco) {
		this.nombre_barco = nombre_barco;
	}
	public int getNum_amarre() {
		return num_amarre;
	}
	public void setNum_amarre(int num_amarre) {
		this.num_amarre = num_amarre;
	}

}
