package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BeneficiarioDao;
import com.example.demo.dao.PlanDao;
import com.example.demo.dao.ServicioSocialDao;
import com.example.demo.dao.TipoApoyoDao;
import com.example.demo.dto.BeneficiarioDto;
import com.example.demo.model.Beneficiario;
import com.example.demo.model.BeneficiarioID;
import com.example.demo.model.Plan;
import com.example.demo.model.ServicioSocial;
import com.example.demo.model.TipoApoyo;
import com.example.demo.service.BeneficiarioService;

@Service(value = "beneficiarioService")
public class BeneficiarioServiceImpl implements BeneficiarioService{

    @Autowired
    BeneficiarioDao beneficiarioDao;
    @Autowired
    PlanDao planDao;
    @Autowired
    TipoApoyoDao tipoApoyoDao;
    @Autowired
    ServicioSocialDao servicioSocialDao;


    @Override
    public Beneficiario save(BeneficiarioDto beneficiarioInf) {
        Beneficiario beneficiario = beneficiarioInf.getBeneficiarioFromDto();
        Plan plan = (Plan) planDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());        
        TipoApoyo tipoApoyo = (TipoApoyo) tipoApoyoDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());
        Iterable<ServicioSocial> servicioSocial = servicioSocialDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());
        beneficiario.setId_plan(plan);
        beneficiario.setId_tipo_apoyo(tipoApoyo);
        beneficiario.setId_servicio((ServicioSocial) servicioSocial);
        return beneficiarioDao.save(beneficiario);
    }

    @Override
    public List<Beneficiario> findAll() {
        return (List<Beneficiario>) beneficiarioDao.findAll();
    }

    @Override
    public Optional<Beneficiario> findByPk(BeneficiarioID beneficiarioId) {
        return beneficiarioDao.findById(beneficiarioId);
    }

    @Override
    public Beneficiario update(BeneficiarioDto beneficiarioInf) {
        Beneficiario beneficiario = beneficiarioInf.getBeneficiarioFromDto();
        Plan plan = (Plan) planDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());        
        TipoApoyo tipoApoyo = (TipoApoyo) tipoApoyoDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());
        Iterable<ServicioSocial> servicioSocial = servicioSocialDao.findAllById((Iterable<Integer>) beneficiario.getId_plan());
        beneficiario.setId_plan(plan);
        beneficiario.setId_tipo_apoyo(tipoApoyo);
        beneficiario.setId_servicio((ServicioSocial) servicioSocial);
        return beneficiarioDao.save(beneficiario);
    }
    
}
