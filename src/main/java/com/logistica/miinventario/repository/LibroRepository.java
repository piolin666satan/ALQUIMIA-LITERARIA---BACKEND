package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.miinventario.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    
}
