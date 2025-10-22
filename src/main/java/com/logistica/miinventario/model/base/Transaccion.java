package com.logistica.miinventario.model.base;

import com.logistica.miinventario.model.Cliente;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Transaccion {
    protected Cliente cliente; 
    protected double monto;    
    protected String fecha;

    public Transaccion() {
    }

    public Transaccion(Cliente cliente, double monto, String fecha) {
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("Telefono: " + cliente.getTelefono());
    }

    // Método abstracto (obligatorio de implementar en cada clase hija)
    public abstract void procesar();
}
