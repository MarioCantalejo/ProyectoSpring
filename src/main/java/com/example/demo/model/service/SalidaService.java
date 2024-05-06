package com.example.demo.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Barco;
import com.example.demo.model.entity.Salida;
import com.example.demo.model.entity.Socio;
import com.example.demo.model.persist.SalidaRepository;

@Service
public class SalidaService {
	
	private final SalidaRepository salidaRepository;
	
	@Autowired
    public SalidaService(SalidaRepository salidaRepository) {
        this.salidaRepository = salidaRepository;
	}
	
	public Salida CrearSalida(Salida s) {
		if(s.getDestino().isEmpty()) {
			return null;
		}
		return s;
	}
	
	public Salida ModificarSocio(Salida s) {
		if(s.getDestino().isEmpty()) {
			return null;
		}
		return salidaRepository.save(s);
	}
	
	public void EliminarSalida(int i) {
		salidaRepository.deleteById(i);
	}
	
	public Optional<Salida> BuscarSalida(int i) {
		Optional<Salida> s = salidaRepository.findById(i);
		if(s == null) {
			return null;
		}
		return s;
	}
}
