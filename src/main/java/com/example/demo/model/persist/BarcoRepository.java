package com.example.demo.model.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Barco;
@Repository
public interface BarcoRepository extends JpaRepository<Barco, Integer> {

}
