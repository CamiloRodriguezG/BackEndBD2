package com.example.demo.dto;

import com.example.demo.model.Evaluacion;
import com.example.demo.model.EvaluacionID;

public class EvaluacionDto {

    private String id_evaluador;
    private int id_requerimiento;
    private int id_solicitud;
    private String observacion;
    public EvaluacionDto(String id_evaluador, int id_requerimiento, int id_solicitud, String observacion) {
        this.id_evaluador = id_evaluador;
        this.id_requerimiento = id_requerimiento;
        this.id_solicitud = id_solicitud;
        this.observacion = observacion;
    }
    public String getId_evaluador() {
        return id_evaluador;
    }
    public void setId_evaluador(String id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
    public int getId_requerimiento() {
        return id_requerimiento;
    }
    public void setId_requerimiento(int id_requerimiento) {
        this.id_requerimiento = id_requerimiento;
    }
    public int getId_solicitud() {
        return id_solicitud;
    }
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Evaluacion getEvaluacionFromDto(){
        Evaluacion evaluacion = new Evaluacion();
        EvaluacionID evaluacionID = new EvaluacionID(id_evaluador, id_requerimiento, id_solicitud);
        evaluacion.setEvaluacionPK(evaluacionID);
        evaluacion.setObservacion(observacion);
        return evaluacion;
    }
    
}
