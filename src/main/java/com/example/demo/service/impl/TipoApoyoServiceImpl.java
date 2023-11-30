package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TipoApoyoDao;
import com.example.demo.model.TipoApoyo;
import com.example.demo.service.TipoApoyoService;

@Service(value = "tipoApoyoService")
public class TipoApoyoServiceImpl implements TipoApoyoService{
    
    @Autowired
    TipoApoyoDao tipoApoyoDao;

    @Override
    public List<TipoApoyo> findAll() {
        return (List<TipoApoyo>) tipoApoyoDao.findAll();
    }

    @Override
    public Optional<TipoApoyo> findById(int id) {
        return tipoApoyoDao.findById(id);
    }

}
