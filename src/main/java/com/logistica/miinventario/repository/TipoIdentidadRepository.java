package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.logistica.miinventario.model.TipoIdentidad;

@Repository
public interface TipoIdentidadRepository extends JpaRepository<TipoIdentidad, Long> {
}
