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
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_categoria",length = 50, unique = true)
    private String nombreCategoria;

    //cambios
    public Categoria (String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void mostrarDatos() {
        System.out.println(" ID Categoria: " + id);
        System.out.println(" Nombre Categoría: " + nombreCategoria);
    }
}