package com.logistica.miinventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30,nullable = false)
    private String titulo;

    @Column(length = 50,nullable = false)
    private String autor;

    @Column(name = "anio_publicacion",nullable = false)
    private String anioPublicacion;

    public void mostrarDatos() {
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" Año: " + anioPublicacion);
    }
}