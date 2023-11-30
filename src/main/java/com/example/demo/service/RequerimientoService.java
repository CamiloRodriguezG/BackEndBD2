package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Requerimiento;

public interface RequerimientoService {

    List <Requerimiento> findAll();
    Optional<Requerimiento> findById(int id);

}
