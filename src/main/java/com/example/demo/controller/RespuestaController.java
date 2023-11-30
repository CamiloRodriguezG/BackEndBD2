package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Respuesta;
import com.example.demo.model.RespuestaID;
import com.example.demo.service.impl.RespuestaServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/respuesta")
public class RespuestaController {

    @Autowired
    RespuestaServiceImpl respuestaService;

    @GetMapping("/all")
    public List<Respuesta> getAllRespuestas(){
        try {
            return respuestaService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @GetMapping("/id")
    public Optional<Respuesta> porId(@RequestBody RespuestaID id){
        try {
            return respuestaService.findById(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
}
