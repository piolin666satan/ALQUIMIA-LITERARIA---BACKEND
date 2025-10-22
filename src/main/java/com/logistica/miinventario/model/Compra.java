package com.logistica.miinventario.model;

import com.logistica.miinventario.model.base.Transaccion;

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
@Table(name = "Compras")
@EqualsAndHashCode(callSuper= false) //cuando hay "super();"
public class Compra extends Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false) //lenght para clasificarlo varchar
    private String producto;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    public Compra() {
        super();
    }

    public Compra(Cliente cliente, Libro libro ,double monto, String fecha, String producto) {
        super(cliente, monto, fecha); // Llama al constructor de Transaccion
        this.cliente = cliente;
        this.libro = libro;
        this.producto = producto;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando compra del producto: " + producto);
        System.out.println("El cliente pagó $" + monto);
        System.out.println("Fecha de la transaccion se hizo el:" + fecha);
        System.out.println("A nombre de: " + cliente.getNombre());
    }
}
