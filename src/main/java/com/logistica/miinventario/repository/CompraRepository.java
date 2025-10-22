package com.logistica.miinventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistica.miinventario.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository <Compra, Long> {

	void save(CompraRepository productoLibro);
}
