package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estado;
import com.example.demo.service.impl.EstadoServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/estado")
public class EstadoController {
    @Autowired
    private EstadoServiceImpl estadoService;

    @GetMapping("/all")
    private List<Estado> findAllEstados(){
        try {
            return estadoService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @GetMapping("/id/{id}")
    public Optional<Estado> porId(@PathVariable(value = "id") int id){
        try {
            return estadoService.findById(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
