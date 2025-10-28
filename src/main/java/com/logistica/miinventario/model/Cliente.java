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

// Cliente.java

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_cliente",length = 50, unique = true)
    private String nombre;

    @Column(name = "direccion_cliente",length = 100)
    private String direccion;

    @Column(name = "telefono_cliente",length = 25, unique = true)
    private String telefono;

    @Column(name = "numero_documento",length = 30, unique = true)
    private String numeroDocumento;

    public Cliente(String nombre, String direccion, String telefono, String numeroDocumento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroDocumento = numeroDocumento;
    }

    public void mostrarDatos() {
        System.out.println("Cliente:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Identidad: " + numeroDocumento);
        System.out.println("  Direccion: " + direccion);
        System.out.println("  Telefono: " + telefono);
    }
}
