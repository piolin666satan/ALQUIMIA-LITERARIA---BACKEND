package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.miinventario.model.Prestamo;

public interface PrestamoRepository extends JpaRepository <Prestamo, Long> {
    
}
