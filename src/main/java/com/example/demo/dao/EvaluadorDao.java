package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Evaluador;

@Service
public interface EvaluadorDao extends CrudRepository<Evaluador, String>{
    
}
