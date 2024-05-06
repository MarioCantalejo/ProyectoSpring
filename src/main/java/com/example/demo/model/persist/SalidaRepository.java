package com.example.demo.model.persist;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Salida;



public interface SalidaRepository extends JpaRepository<Salida, Integer> {

}
