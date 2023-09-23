package com.example.demo.dto;

import java.util.Date;

import com.example.demo.model.Convocatoria;

public class ConvocatoriaDto {
    private String periodo;
    private int numero_beneficiarios;
    private Date f_inicio_solicitud;
    private Date f_fin_solicitud;

    /*SETTERS */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public void setNumero_beneficiarios(int numero_beneficiarios) {
        this.numero_beneficiarios = numero_beneficiarios;
    }
    public void setF_inicio_solicitud(Date f_inicio_solicitud) {
        this.f_inicio_solicitud = f_inicio_solicitud;
    }
    public void setF_fin_solicitud(Date f_fin_solicitud) {
        this.f_fin_solicitud = f_fin_solicitud;
    }

    /*GETTERS */
    public String getPeriodo() {
        return periodo;
    }
    public int getNumero_beneficiarios() {
        return numero_beneficiarios;
    }
    public Date getF_inicio_solicitud() {
        return f_inicio_solicitud;
    }
    public Date getF_fin_solicitud() {
        return f_fin_solicitud;
    }

    public ConvocatoriaDto(String periodo, int numero_beneficiarios, Date f_inicio_solicitud, Date f_fin_solicitud) {
        this.periodo = periodo;
        this.numero_beneficiarios = numero_beneficiarios;
        this.f_inicio_solicitud = f_inicio_solicitud;
        this.f_fin_solicitud = f_fin_solicitud;
    }

    public Convocatoria getConvocatoriaFromDto(){
        Convocatoria convocatoria = new Convocatoria();
        convocatoria.setPeriodo(periodo);
        convocatoria.setNumero_beneficiarios(numero_beneficiarios);
        convocatoria.setF_inicio_solicitud(f_inicio_solicitud);
        convocatoria.setF_fin_solicitud(f_fin_solicitud);
        
        return convocatoria; 
    }

}
