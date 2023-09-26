package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Solicitud;
import com.example.demo.service.impl.SolicitudServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    @Autowired
    private SolicitudServiceImpl solicitudService;

    @GetMapping("/all")
    public List<Solicitud> findAllSolicitudes(){
        return solicitudService.findAll();
    }
}
