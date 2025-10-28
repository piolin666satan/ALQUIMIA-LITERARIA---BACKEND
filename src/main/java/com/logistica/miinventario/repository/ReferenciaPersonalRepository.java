package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.logistica.miinventario.model.ReferenciaPersonal;

@Repository
public interface ReferenciaPersonalRepository extends JpaRepository<ReferenciaPersonal, Long> {
}
