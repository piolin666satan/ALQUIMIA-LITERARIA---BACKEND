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
@Table(name = "compras")
// @EqualsAndHashCode(callSuper= false) //cuando hay "super();"
public class Compra {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    //cambios
    @Column(name = "monto", nullable = false)
    protected double monto;

    //cambios
    @Column(name = "fecha", length = 20, unique = true)
    protected String fecha;

    @Column(name = "producto",length = 50, unique = true) //lenght para clasificarlo varchar
    private String producto;

    public Compra (double monto, String fecha, String producto) {
        this.monto = monto;
        this.fecha = fecha;
        this.producto = producto;
    }

    public void procesar() {
        System.out.println("Procesando compra del producto: " + producto);
        System.out.println("El cliente pagó $" + monto);
        System.out.println("Fecha de la transaccion se hizo el:" + fecha);
    }
}
