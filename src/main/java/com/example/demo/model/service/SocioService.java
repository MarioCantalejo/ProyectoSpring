package com.example.demo.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Barco;
import com.example.demo.model.entity.Socio;
import com.example.demo.model.persist.SocioRepository;

import java.util.List;

@Service
public class SocioService {

	private final SocioRepository socioRepository;
	
	@Autowired
    public SocioService(SocioRepository socioRepository) {
        this.socioRepository = socioRepository;
	}
	
	public Socio CrearSocio(Socio s) {
		if(s.getNombre().isEmpty()){
			return null;
		}
		return socioRepository.save(s);
	}
	
	public Socio ModificarSocio(Socio s) {
		if(s.getNombre().isEmpty()) {
			return null;
		}
		return socioRepository.save(s);
	}
	
	public void EliminarSocio(int id) {
		socioRepository.deleteById(id);
	}
	
	public Optional<Socio> BuscarSocio(int i) {
		Optional<Socio> s = socioRepository.findById(i);
		if(s == null) {
			return null;
		}
		return s;
	}
	
	public List<Socio> mostrarSocios(){
		return socioRepository.findAll();	}
	
}
