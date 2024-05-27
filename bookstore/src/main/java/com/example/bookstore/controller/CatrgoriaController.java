package com.example.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.models.Categoria;
import com.example.bookstore.service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CatrgoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id){
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(categoria);    
    }
    
    
}
