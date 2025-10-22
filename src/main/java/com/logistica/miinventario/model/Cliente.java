package com.logistica.miinventario.model;

import java.util.List;

import com.logistica.miinventario.model.interfaces.Registrable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

// Cliente.java

@Entity
@Data
@Table(name = "clientes")
public class Cliente implements Registrable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String nombre;

    @Column(length = 40,nullable = false)
    private String direccion;

    @Column(length = 20,nullable = false)
    private String telefono;

    @Column(name = "Documento",nullable = false)
    private String numeroDocumento;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private TipoIdentidad tipoIdentidad;

    //solo si hay muchas referencias personales crea una lista por si algo
    //opcional
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<ReferenciaPersonal> referencias;

    @Override
    public void mostrarDatos() {
        System.out.println("Cliente:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Identidad: " + numeroDocumento);
        System.out.println("  Direccion: " + direccion);
        System.out.println("  Telefono: " + telefono);
    }
}
