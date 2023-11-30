package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Evaluacion;
import com.example.demo.model.EvaluacionID;

@Service
public interface EvaluacionDao extends CrudRepository<Evaluacion, EvaluacionID>{

}
