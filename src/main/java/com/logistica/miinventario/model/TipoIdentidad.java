package com.logistica.miinventario.model;

import com.logistica.miinventario.model.interfaces.Registrable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper= false)
public class TipoIdentidad implements Registrable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_identidad;

    @Column(name = "Documento",nullable = false)
    private String descripcion;


    public TipoIdentidad(){
        super();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de identidad: " + id_tipo_identidad);
        System.out.println("Descripcion: " + descripcion);
    }
}