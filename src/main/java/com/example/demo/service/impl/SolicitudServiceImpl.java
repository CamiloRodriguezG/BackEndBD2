package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SolicitudDao;
import com.example.demo.model.Solicitud;
import com.example.demo.service.SolicitudService;

@Service(value = "solicitudService")
public class SolicitudServiceImpl implements SolicitudService{

    @Autowired
    private SolicitudDao solicitudDao;

    @Override
    public List<Solicitud> findAll() {
        return (List<Solicitud>) solicitudDao.findAll();
    }
    
}
