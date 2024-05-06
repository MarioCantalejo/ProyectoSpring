package com.example.demo.model.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Barco;
import com.example.demo.model.service.BarcoService;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;



@RestController
@RequestMapping("/api/v1/barco")
@CrossOrigin("*")
public class BarcoController {
	
	private final BarcoService barcoService;
	
	public BarcoController(BarcoService barcoService) {
		this.barcoService = barcoService;
	}
	
	@GetMapping()
	public ResponseEntity<?> mostrarBarcos(){
		List<Barco> barcos = barcoService.MostrarBarcos();
		return ResponseEntity.ok(barcos);
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<?> obtenerBarcoPorId(@PathVariable("id") Integer id) {
        Barco barco = barcoService.BuscarBarco(id);
        
        if (barco == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Barco no encontrado con ID: " + id);
        }
        
        return ResponseEntity.ok(barco);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarBarco(@PathVariable("id") Integer id){
		try {
		    Boolean resultado = barcoService.eliminarBarco(id);
		    if (!resultado) {
		        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("No se ha podido eliminar el barco con ID: " + id);
		    }
		    return ResponseEntity.ok("Barco eliminado con ID: " + id);
		} catch (Exception e) {
		    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al eliminar el barco con ID: " + id + "Error :" + e);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modificarBarco(@PathVariable Integer id,  @RequestBody Barco nuevaBarco) {
		try {
			Barco barco = barcoService.BuscarBarco(id);
			if(barco == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Barco no encontrado con ID: " + id);
			}
			barcoService.ModificarBarco(nuevaBarco);
		    return ResponseEntity.ok(nuevaBarco);

		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se ha podido modificar el barco. Error: " + e);
		}
		
	}
	
	@PostMapping()
	public ResponseEntity<?> crearBarco(@RequestBody Barco nuevoBarco) {
		Barco barcoCreado = barcoService.CrearBarco(nuevoBarco);
		
		if(barcoCreado != null) {
			return new ResponseEntity<>(barcoCreado, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>("Error al crear el barco", HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	
	
	
	
}
