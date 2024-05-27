package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {
    
}
