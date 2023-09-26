package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Estado;

public interface EstadoService {
    List <Estado> findAll();
    Optional<Estado> findById(int id_estado);
}
