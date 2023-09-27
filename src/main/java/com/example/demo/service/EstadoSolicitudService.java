package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.EstadoSolicitud;

public interface EstadoSolicitudService {
    List <EstadoSolicitud> findAll();
    Optional<EstadoSolicitud> findById(int id_estado);
}
