package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RequerimientoDao;
import com.example.demo.model.Requerimiento;
import com.example.demo.service.RequerimientoService;

@Service(value = "requerimientoService")
public class RequerimientoServiceImpl implements RequerimientoService{

    @Autowired
    RequerimientoDao requerimientoDao;

    @Override
    public List<Requerimiento> findAll() {
        return (List<Requerimiento>) requerimientoDao.findAll();
    }

    @Override
    public Optional<Requerimiento> findById(int id) {
        return requerimientoDao.findById(id);
    }
    
}
