package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvaluadorDao;
import com.example.demo.model.Evaluador;
import com.example.demo.service.EvaluadorService;

@Service(value = "evaluadorService")
public class EvaluadorServiceImpl implements EvaluadorService{
    @Autowired
    EvaluadorDao evaludaroDao;

    @Override
    public List<Evaluador> findAll() {
        return (List<Evaluador>) evaludaroDao.findAll();
    }

    @Override
    public Optional<Evaluador> findById(String id_evaluador) {
        return evaludaroDao.findById(id_evaluador);
    }
    
}
