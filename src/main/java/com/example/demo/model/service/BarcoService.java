package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Barco;
import com.example.demo.model.persist.BarcoRepository;



@Service
public class BarcoService {
	
	private final BarcoRepository barcoRepository;
	
	@Autowired
    public BarcoService(BarcoRepository barcoRepository) {
        this.barcoRepository = barcoRepository;
	}
	
	public Barco CrearBarco(Barco b) {
		if(b.getNombre_barco().isEmpty()) {
			return null;
		}
		return barcoRepository.save(b);
	}
	
	public Barco ModificarBarco(Barco b) {
		if(b.getNombre_barco().isEmpty()) {
			return null;
		}
		return barcoRepository.save(b);
	}
	
	public Barco BuscarBarco(int i) {
		Optional<Barco> barco = barcoRepository.findById(i);
        return barco.orElse(null);
	}
	
	public Boolean eliminarBarco(int id) {
		try {
			Barco barcoExistente = BuscarBarco(id);
			if (barcoExistente != null) {
	            barcoRepository.delete(barcoExistente);
	            return true;
	        } 
			else {
	            return false;
	        }
		}catch (Exception e) {
			return false;
		}
	}
	public List<Barco> MostrarBarcos(){
		return barcoRepository.findAll();
	}
}
