package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlanDao;
import com.example.demo.model.Plan;
import com.example.demo.service.PlanService;

@Service(value = "planService")
public class PlanServiceImpl implements PlanService{

    @Autowired
    PlanDao planDao;

    @Override
    public List<Plan> findAll() {
        return (List<Plan>) planDao.findAll();
    }

    @Override
    public Optional<Plan> findById(int id) {
        return planDao.findById(id);
    }
    
}
