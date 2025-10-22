package com.logistica.miinventario.model.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Entidad {
    public Entidad() {
        System.out.println("Entidad creada");
    }

    public abstract void mostrarDatos();
}