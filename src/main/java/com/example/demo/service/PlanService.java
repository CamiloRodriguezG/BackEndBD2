package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Plan;

public interface PlanService {
    List <Plan> findAll();
    Optional<Plan> findById(int id);
}
