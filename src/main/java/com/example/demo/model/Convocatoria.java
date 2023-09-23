package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Convocatoria {
    
    @Id
    private String periodo;
    @Column
    private int numero_beneficiarios;
    @Column
    private Date f_inicio_solicitud;
    @Column
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

    

}
