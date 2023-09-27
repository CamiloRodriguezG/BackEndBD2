package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.EstadoSolicitud;

public interface EstadoSolicitudDao extends CrudRepository<EstadoSolicitud, Integer>{
    
}
