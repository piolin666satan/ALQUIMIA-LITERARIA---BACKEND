package com.logistica.miinventario.model;

import com.logistica.miinventario.model.base.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categorias")
public class Categoria extends Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50,nullable = false)
    private String nombreCategoria;


    @Override
    public void mostrarDatos() {
        System.out.println(" ID Categoria: " + id);
        System.out.println(" Nombre Categoría: " + nombreCategoria);
    }
}