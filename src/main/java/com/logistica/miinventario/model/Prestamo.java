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
@Table(name = "Prestamos")
@EqualsAndHashCode(callSuper= false)
public class Prestamo extends Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dias_plazo" ,nullable = false)
    private int fechaDevolucion;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    public Prestamo() {
        super();
    }

    public Prestamo(Cliente cliente, double monto, String fecha, int diasPlazo) {
        super(cliente, monto, fecha);
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando prestamo de $" + monto);
        System.out.println("El cliente debe devolverlo el " + fechaDevolucion );
    }
}
