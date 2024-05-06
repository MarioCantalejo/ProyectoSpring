package com.example.demo.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Patron;
import com.example.demo.model.persist.PatronRepository;

@Service
public class PatronService {

	PatronRepository patronRepository;
	
	@Autowired
    public PatronService(PatronRepository patronRepository) {
        this.patronRepository = patronRepository;
	}
	
	public Patron CrearPatron(Patron p) {
		if(p.getApellido_pat().isEmpty()){
			return null;
		}
		return patronRepository.save(p);
	}
	
	public Patron ModificarPatron(Patron p) {
		if(p.getApellido_pat().isEmpty()){
			return null;
		}
		return patronRepository.save(p);
	}
	
	public void EliminarPatron(int i) {
		patronRepository.deleteById(i);
	}
	
	public Optional<Patron> BuscarPatron(int i) {
		Optional<Patron> p = patronRepository.findById(i);
		if(p == null) {
			return null;
		}
		return p;
	}
}
