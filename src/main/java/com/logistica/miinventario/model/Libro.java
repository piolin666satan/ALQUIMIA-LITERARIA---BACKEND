package com.logistica.miinventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo",length = 40, unique = true)
    private String titulo;

    @Column(name = "autor",length = 50, unique = true)
    private String autor;

    @Column(name = "anio_publicacion",length = 25)
    private String anioPublicacion;

    public Libro (String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarDatos() {
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" Año: " + anioPublicacion);
    }
}