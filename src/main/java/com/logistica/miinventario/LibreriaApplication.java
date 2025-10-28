package com.logistica.miinventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.logistica.miinventario.model.Categoria;
import com.logistica.miinventario.model.Compra;
import com.logistica.miinventario.repository.CategoriaRepository;
import com.logistica.miinventario.repository.ClienteRepository;
import com.logistica.miinventario.repository.CompraRepository;
import com.logistica.miinventario.repository.LibroRepository;
import com.logistica.miinventario.repository.PrestamoRepository;
import com.logistica.miinventario.repository.ReferenciaPersonalRepository;
import com.logistica.miinventario.repository.TipoIdentidadRepository;

@SpringBootApplication
public class LibreriaApplication implements CommandLineRunner{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

	@Autowired
	private CompraRepository compraRepository;

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Autowired
    private ReferenciaPersonalRepository referenciaPersonalRepository;

    @Autowired
    private TipoIdentidadRepository tipoIdentidadRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

@Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- GUARDANDO COMPRA EN LA BASE DE DATOS ---");

        //COMPRA
        // CREATE
        System.out.println("1. Creando y guardando un producto inicial...");
        Compra compra1 = new Compra(5500,"28/10/2025", "fundamentos de javascript");
        compraRepository.save(compra1); // Aquí se guarda automáticamente en SQL Server

        System.out.println("Compra guardada exitosamente con ID: " + compra1.getProducto());
        System.out.println("Detalles: " + compra1); //muestra que el producto se guardo exitosamente

        System.out.println("\n--- CRUD BÁSICO CATEGORIA ---");
        //CATEGORIA
        //CREATE
        System.out.println("1. Creando y guardando una categoria inicial...");
        Categoria categoriaInicial = new Categoria("Coding");
        categoriaRepository.save(categoriaInicial);
        System.out.println("Categoria guardada exitosamente con ID: " + categoriaInicial);
	}
}
