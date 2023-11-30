package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Requerimiento;

@Service
public interface RequerimientoDao extends CrudRepository<Requerimiento, Integer>{
    
}
