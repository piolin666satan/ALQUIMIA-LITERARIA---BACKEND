package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.miinventario.model.TipoIdentidad;

public interface TipoIdentidadRepository extends JpaRepository <TipoIdentidad, Long> {
    
}
