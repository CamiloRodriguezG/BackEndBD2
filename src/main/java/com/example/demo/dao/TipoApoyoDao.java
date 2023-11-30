package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.TipoApoyo;

@Service
public interface TipoApoyoDao extends CrudRepository<TipoApoyo, Integer>{
    
}
