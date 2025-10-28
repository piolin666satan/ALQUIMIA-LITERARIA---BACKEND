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
@Table(name = "prestamos")
public class Prestamo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //cambios
    @Column(name = "monto", nullable = false)
    protected double monto;
    //cambios
    @Column(name = "fecha", length = 20, unique = true)
    protected String fecha;

    @Column(name = "dias_plazo" ,nullable = false)
    private int fechaDevolucion;

    public Prestamo (double monto, String fecha, int fechaDevolucion) {
        this.monto = monto;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
    }


    public void procesar() {
        System.out.println("Procesando prestamo de $" + monto);
        System.out.println("El cliente debe devolverlo el " + fechaDevolucion );
    }
}
