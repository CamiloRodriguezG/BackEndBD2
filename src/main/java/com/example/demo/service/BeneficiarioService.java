package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.BeneficiarioDto;
import com.example.demo.model.Beneficiario;
import com.example.demo.model.BeneficiarioID;

public interface BeneficiarioService {
    Beneficiario save(BeneficiarioDto beneficiarioInf);
    List <Beneficiario> findAll();
    Optional<Beneficiario> findByPk(BeneficiarioID beneficiarioID);
    Beneficiario update(BeneficiarioDto beneficiarioInf);
}
