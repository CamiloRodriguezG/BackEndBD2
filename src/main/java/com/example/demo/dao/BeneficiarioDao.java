package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Beneficiario;
import com.example.demo.model.BeneficiarioID;

@Service
public interface BeneficiarioDao extends CrudRepository<Beneficiario, BeneficiarioID>{

}
