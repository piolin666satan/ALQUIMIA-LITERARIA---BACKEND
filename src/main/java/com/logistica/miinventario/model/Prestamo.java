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
@Table(name = "prestamos")
public class Prestamo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected double monto;    
    protected String fecha;

    @Column(name = "dias_plazo" ,nullable = false)
    private int fechaDevolucion;


    public void procesar() {
        System.out.println("Procesando prestamo de $" + monto);
        System.out.println("El cliente debe devolverlo el " + fechaDevolucion );
    }
}
