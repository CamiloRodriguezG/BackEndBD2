package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.ServicioSocial;

@Service
public interface ServicioSocialDao extends CrudRepository<ServicioSocial, Integer>{
    
}
