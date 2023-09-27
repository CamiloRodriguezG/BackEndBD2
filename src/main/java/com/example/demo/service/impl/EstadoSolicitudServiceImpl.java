package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EstadoSolicitudDao;
import com.example.demo.model.EstadoSolicitud;
import com.example.demo.service.EstadoSolicitudService;

public class EstadoSolicitudServiceImpl implements EstadoSolicitudService{
    @Autowired
    EstadoSolicitudDao eSolicitudDao;

    @Override
    public List<EstadoSolicitud> findAll() {
        return (List<EstadoSolicitud>) eSolicitudDao.findAll();
    }

    @Override
    public Optional<EstadoSolicitud> findById(int id_estado) {
        return eSolicitudDao.findById(id_estado);
    }
    
}
