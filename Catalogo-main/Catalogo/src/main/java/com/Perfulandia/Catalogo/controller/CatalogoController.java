package com.Perfulandia.Catalogo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Perfulandia.Catalogo.model.Catalogo;
import com.Perfulandia.Catalogo.service.CatalogoService;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {

    private final CatalogoService catalogoService;

    public CatalogoController(CatalogoService catalogoService) {
        this.catalogoService = catalogoService;
    }
    @PostMapping
    public ResponseEntity<Catalogo> guardar(@RequestBody Catalogo catalogo){
        Catalogo nuevoPedido = catalogoService.guardar(catalogo);
        return new ResponseEntity<>(nuevoPedido, HttpStatus.CREATED);
    }

}
