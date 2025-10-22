package com.logistica.miinventario.model;

import com.logistica.miinventario.model.interfaces.Registrable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@Table(name = "referencia_personal")
@EqualsAndHashCode(callSuper= false)
public class ReferenciaPersonal implements Registrable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(nullable = false)
    private String nombreReferencia;

    @Column(nullable = false)
    private String telefonoReferencia;
    

    public ReferenciaPersonal() {
        super();
    }

    public ReferenciaPersonal(Cliente cliente,String nombreReferencia, String telefonoReferencia) {
        this.cliente = cliente;
        this.nombreReferencia = nombreReferencia;
        this.telefonoReferencia = telefonoReferencia;
    }

    public void mostrarDatos() {
        System.out.println("Referencia Personal: " + cliente.getNombre() + " " + cliente.getNumeroDocumento());
        System.out.println("Nombre de referencia: " + nombreReferencia);
        System.out.println("Teléfono de referencia: " + telefonoReferencia);
    }

    public void ingresarDatos() {
        System.out.println("Ingresando datos de referencia personal...");
    }
}
