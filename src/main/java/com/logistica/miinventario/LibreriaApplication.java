package com.logistica.miinventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.logistica.miinventario.model.Compra;
import com.logistica.miinventario.repository.CompraRepository;

@SpringBootApplication
public class LibreriaApplication implements CommandLineRunner{

	@Autowired
	private CompraRepository compraRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

@Override
    public void run(String... args) throws Exception {
        System.out.println("--- CRUD BÁSICO COMPRA ---");

        Compra compra = new Compra();
        compra.setProducto("Lapicero");
        compra.setMonto(2500);
        compra.setFecha("2025-10-27");
        compraRepository.save(compra);

        System.out.println("Compra guardada: " + compra);
	}

}
