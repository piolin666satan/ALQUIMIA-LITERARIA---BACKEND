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
		System.out.println("\n--- CRUD BÁSICO PRODUCTO---");
        // CREATE
        System.out.println("1. Creando y guardando una compra....");

        CompraRepository productoLibro = (CompraRepository) new Compra(null, null, 0, null, null);
        compraRepository.save(productoLibro);
        System.out.println("Producto guardado: " + productoLibro.getClass().getName());
	}

}
