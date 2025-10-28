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
@Table(name = "tipo_identidad")
public class TipoIdentidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_identidad;

    @Column(name = "Documento",nullable = false)
    private String descripcion;

    
    public void mostrarDatos() {
        System.out.println("Tipo de identidad: " + id_tipo_identidad);
        System.out.println("Descripcion: " + descripcion);
    }
}