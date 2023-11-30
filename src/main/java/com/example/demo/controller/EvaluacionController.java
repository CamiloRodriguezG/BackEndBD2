package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Evaluacion;
import com.example.demo.model.EvaluacionID;
import com.example.demo.service.impl.EvaluacionServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/evaluacion")
public class EvaluacionController {
    
    @Autowired
    EvaluacionServiceImpl evaluacionService;

    @GetMapping("/all")
    public List<Evaluacion> getAllEvaluaciones(){
        try {
            return evaluacionService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @GetMapping("/id")
    public Iterable<Evaluacion> porId(@RequestBody EvaluacionID id){
        try {
            return evaluacionService.findById(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

}
