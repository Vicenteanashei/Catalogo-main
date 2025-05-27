package com.Perfulandia.Catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Perfulandia.Catalogo.model.Categoria;
import com.Perfulandia.Catalogo.service.CategoriaService;


@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria){
        Categoria nuevaCategoria = categoriaService.guardar(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Categoria>> listar() {
        return ResponseEntity.ok(categoriaService.obtenerTodas());
    }


}
