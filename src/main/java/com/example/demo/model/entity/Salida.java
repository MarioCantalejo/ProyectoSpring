package com.example.demo.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salida {
	@Id
	private int id_salida;
	private int id_patron;
	private int id_barco;
	private Date fecha_hora;
	private String destino;
	public int getId_salida() {
		return id_salida;
	}
	public void setId_salida(int id_salida) {
		this.id_salida = id_salida;
	}
	public int getId_patron() {
		return id_patron;
	}
	public void setId_patron(int id_patron) {
		this.id_patron = id_patron;
	}
	public int getId_barco() {
		return id_barco;
	}
	public void setId_barco(int id_barco) {
		this.id_barco = id_barco;
	}
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
