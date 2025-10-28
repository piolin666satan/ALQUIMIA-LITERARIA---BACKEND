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
@Table(name = "referencia_personal")
public class ReferenciaPersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_referencia",length = 50, unique = true)
    private String nombreReferencia;

    @Column(name = "telefono_referencia",length = 25, unique = true)
    private String telefonoReferencia;
    

    public void mostrarDatos() {
        System.out.println("Nombre de referencia: " + nombreReferencia);
        System.out.println("Teléfono de referencia: " + telefonoReferencia);
    }

    public ReferenciaPersonal(String nombreReferencia, String telefonoReferencia) {
        this.nombreReferencia = nombreReferencia;
        this.telefonoReferencia = telefonoReferencia;
    }

    public void ingresarDatos() {
        System.out.println("Ingresando datos de referencia personal...");
    }
}
