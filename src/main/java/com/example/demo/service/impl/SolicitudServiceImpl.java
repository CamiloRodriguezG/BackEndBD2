package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ConvocatoriaDao;
import com.example.demo.dao.EstudianteDao;
import com.example.demo.dao.SolicitudDao;
import com.example.demo.dto.SolicitudDto;
import com.example.demo.model.Convocatoria;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Solicitud;
import com.example.demo.service.SolicitudService;

@Service(value = "solicitudService")
public class SolicitudServiceImpl implements SolicitudService{

    @Autowired
    private SolicitudDao solicitudDao;
    @Autowired
    private EstudianteDao estudianteDao;
    @Autowired
    private ConvocatoriaDao convocatoriaDao;

    @Override
    public List<Solicitud> findAll() {
        return (List<Solicitud>) solicitudDao.findAll();
    }

    @Override
    public Solicitud saveSolicitud(SolicitudDto solicitudInf) {
        Solicitud solicitudAGuardar = solicitudInf.getSolicitudFromDto();
        Optional<Estudiante> estudiante = estudianteDao.findById(solicitudInf.getId_codigo());        
        Optional<Convocatoria> convocatoria = convocatoriaDao.findById(solicitudInf.getId_periodo());
        solicitudAGuardar.setId_codigo(estudiante.get());
        solicitudAGuardar.setId_periodo(convocatoria.get());
        return solicitudDao.save(solicitudAGuardar);
    }

    @Override
    public Solicitud updateSolicitud(SolicitudDto solicitudInf) {
        Solicitud solicitudActualizar = solicitudInf.getSolicitudFromDto();
        Optional<Estudiante> estudiante = estudianteDao.findById(solicitudInf.getId_codigo());        
        Optional<Convocatoria> convocatoria = convocatoriaDao.findById(solicitudInf.getId_periodo());
        solicitudActualizar.setId_codigo(estudiante.get());
        solicitudActualizar.setId_periodo(convocatoria.get());
        return solicitudDao.save(solicitudActualizar);
    }
    
}
