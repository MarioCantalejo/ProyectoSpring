package com.example.demo.model.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Socio;
import com.example.demo.model.service.SocioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/socio")
@CrossOrigin("*")
public class SocioController {
	
	private final SocioService socioService;
	
	public SocioController(SocioService socioService) {
		this.socioService = socioService;
	}
	
	@GetMapping()
	public ResponseEntity<?> mostrarBarcos() {
		List<Socio> socios = socioService.mostrarSocios();
		return ResponseEntity.ok(socios);
	}
	
}
