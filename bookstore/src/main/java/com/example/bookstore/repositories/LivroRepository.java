package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.models.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    
}
