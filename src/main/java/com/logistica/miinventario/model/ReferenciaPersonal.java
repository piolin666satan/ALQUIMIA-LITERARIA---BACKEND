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
@Table(name = "referencia_personal")
public class ReferenciaPersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreReferencia;

    @Column(nullable = false)
    private String telefonoReferencia;
    

    public void mostrarDatos() {
        System.out.println("Nombre de referencia: " + nombreReferencia);
        System.out.println("Teléfono de referencia: " + telefonoReferencia);
    }

    public void ingresarDatos() {
        System.out.println("Ingresando datos de referencia personal...");
    }
}
