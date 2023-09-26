package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EstadoDao;
import com.example.demo.model.Estado;
import com.example.demo.service.EstadoService;

@Service(value = "estadoService")
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    private EstadoDao estadoDao;

    @Override
    public List<Estado> findAll() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public Optional<Estado> findById(int id_estado) {
        return estadoDao.findById(id_estado);
    }
    
}
