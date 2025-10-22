package com.logistica.miinventario.model;

import com.logistica.miinventario.model.base.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Libros")
public class Libro extends Entidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30,nullable = false)
    private String titulo;

    @Column(length = 50,nullable = false)
    private String autor;

    @Column(name = "anio_publicacion",nullable = false)
    private String anioPublicacion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Libro(){
        super();
    }

    @Override
    public void mostrarDatos() {
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Autor: " + autor);
        System.out.println(" Año: " + anioPublicacion);
    }
}