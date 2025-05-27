package com.Perfulandia.Catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Perfulandia.Catalogo.model.Categoria;
import com.Perfulandia.Catalogo.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }
}