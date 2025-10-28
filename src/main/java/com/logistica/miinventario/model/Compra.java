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
@Table(name = "compras")
// @EqualsAndHashCode(callSuper= false) //cuando hay "super();"
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //cambios
    @Column(name = "monto", nullable = false)
    protected double monto;

    //cambios
    @Column(name = "fecha", length = 20)
    protected String fecha;

    @Column(length = 50,nullable = false) //lenght para clasificarlo varchar
    private String producto;

    public void procesar() {
        System.out.println("Procesando compra del producto: " + producto);
        System.out.println("El cliente pagó $" + monto);
        System.out.println("Fecha de la transaccion se hizo el:" + fecha);
    }
}
