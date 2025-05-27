package com.Perfulandia.Catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Perfulandia.Catalogo.model.Catalogo;
import com.Perfulandia.Catalogo.repository.CatalogoRepository;


@Service
public class CatalogoService {
    @Autowired
    private final CatalogoRepository catalogoRepository;

    public CatalogoService(CatalogoRepository catalogoRepository) {
        this.catalogoRepository = catalogoRepository;
    }

    public Catalogo guardar(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    public List<Catalogo> obtenerTodos() {
        return catalogoRepository.findAll();
    }

}

