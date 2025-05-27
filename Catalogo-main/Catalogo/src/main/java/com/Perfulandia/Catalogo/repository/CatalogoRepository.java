package com.Perfulandia.Catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Perfulandia.Catalogo.model.Catalogo;
@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {
    
}
