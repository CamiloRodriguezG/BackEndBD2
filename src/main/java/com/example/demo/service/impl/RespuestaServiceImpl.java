package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RespuestaDao;
import com.example.demo.dto.RespuestaDto;
import com.example.demo.model.Respuesta;
import com.example.demo.model.RespuestaID;
import com.example.demo.service.RespuestaService;

@Service(value = "respuestaService")
public class RespuestaServiceImpl implements RespuestaService{

    @Autowired
    RespuestaDao respuestaDao;

    @Override
    public List<Respuesta> findAll() {
        return (List<Respuesta>) respuestaDao.findAll();
    }

    @Override
    public Optional<Respuesta> findById(RespuestaID id) {
        return respuestaDao.findById(id);
    }

    @Override
    public Respuesta save(RespuestaDto respuestaDto) {
        return respuestaDao.save(respuestaDto.getResuestaFromDto());
    }
    
}
