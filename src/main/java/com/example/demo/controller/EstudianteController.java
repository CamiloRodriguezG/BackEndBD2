package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.impl.EstudianteServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteServiceImpl estudianteService;

    @GetMapping("/codigo/{codigo}")
    public Optional<Estudiante> porCodigo(@PathVariable(value = "codigo") Long codigo){
        return estudianteService.findByCodigo(codigo);
    }
}
