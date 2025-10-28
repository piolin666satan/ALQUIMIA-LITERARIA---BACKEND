package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.miinventario.model.ReferenciaPersonal;

public interface ReferenciaPersonalRepository extends JpaRepository <ReferenciaPersonal, Long> {
    
}
