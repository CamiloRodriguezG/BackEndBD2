package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.RespuestaDto;
import com.example.demo.model.Respuesta;
import com.example.demo.model.RespuestaID;

public interface RespuestaService {
    List<Respuesta> findAll();
    Optional<Respuesta> findById(RespuestaID id);
    Respuesta save(RespuestaDto respuestaDto);
}
