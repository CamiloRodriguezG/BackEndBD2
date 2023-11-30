package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.TipoApoyo;

public interface TipoApoyoService {
    List <TipoApoyo> findAll();
    Optional<TipoApoyo> findById(int id);
}
