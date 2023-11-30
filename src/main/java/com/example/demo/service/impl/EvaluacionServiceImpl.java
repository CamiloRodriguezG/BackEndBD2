package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvaluacionDao;
import com.example.demo.dto.EvaluacionDto;
import com.example.demo.model.Evaluacion;
import com.example.demo.model.EvaluacionID;
import com.example.demo.service.EvaluacionService;

@Service(value = "evaluacionService")
public class EvaluacionServiceImpl implements EvaluacionService{

    @Autowired
    EvaluacionDao evaluacionDao;

    @Override
    public List<Evaluacion> findAll() {
        return (List<Evaluacion>) evaluacionDao.findAll();
    }

    @Override
    public Iterable<Evaluacion> findById(EvaluacionID id) {
        return evaluacionDao.findAllById((Iterable<EvaluacionID>) id);
    }

    @Override
    public Evaluacion save(EvaluacionDto evaluacionDto) {
        return evaluacionDao.save(evaluacionDto.getEvaluacionFromDto());
    }
    
}
