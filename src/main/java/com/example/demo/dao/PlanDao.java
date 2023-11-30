package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Plan;

@Service
public interface PlanDao extends CrudRepository<Plan, Integer>{
    
}
