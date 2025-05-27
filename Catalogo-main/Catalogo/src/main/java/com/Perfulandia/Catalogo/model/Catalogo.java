package com.Perfulandia.Catalogo.model;

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
@Table(name = "catalogos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(nullable = false)
    private int id_producto;  
    @Column(length = 100, nullable = false)
    private String categoria;
    @Column(length = 100, nullable = false)
    private String descripcion;

    private Double precio;
    private int cantidadDisponible;

    public void visualizar() {
    }
   
    public boolean confirmarOperacion() {
        return true;
    }


}