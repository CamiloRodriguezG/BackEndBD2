package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"CONVOCATORIA\"")
public class Convocatoria {
    
    @Id
    private String id_periodo;
    @Column
    private int num_beneficiarios;
    @Column
    private Date f_inicio_solicitud;
    @Column
    private Date f_fin_solicitud;

    /*SETTERS */
    public void setPeriodo(String periodo) {
        this.id_periodo = periodo;
    }
    public void setNumero_beneficiarios(int numero_beneficiarios) {
        this.num_beneficiarios = numero_beneficiarios;
    }
    public void setF_inicio_solicitud(Date f_inicio_solicitud) {
        this.f_inicio_solicitud = f_inicio_solicitud;
    }
    public void setF_fin_solicitud(Date f_fin_solicitud) {
        this.f_fin_solicitud = f_fin_solicitud;
    }

    /*GETTERS */
    public String getPeriodo() {
        return id_periodo;
    }
    public int getNumero_beneficiarios() {
        return num_beneficiarios;
    }
    public Date getF_inicio_solicitud() {
        return f_inicio_solicitud;
    }
    public Date getF_fin_solicitud() {
        return f_fin_solicitud;
    }

    

}
