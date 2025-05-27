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
@Table(name = "categorias")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private int idCategoria;
    @Column(length = 100, nullable = false)
    private String nombreCategoria;

    @Column(length = 100, nullable = false)
    private String descripcionCategoria;
}
