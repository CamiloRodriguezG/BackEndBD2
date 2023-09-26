package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estado;

@Service
public interface EstadoDao extends CrudRepository<Estado, Integer>{
    
}
