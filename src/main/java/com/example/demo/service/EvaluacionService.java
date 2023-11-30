package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EvaluacionDto;
import com.example.demo.model.Evaluacion;
import com.example.demo.model.EvaluacionID;

public interface EvaluacionService {

    List <Evaluacion> findAll();
    Iterable<Evaluacion> findById(EvaluacionID id);
    Evaluacion save(EvaluacionDto evaluacionDto);
}
