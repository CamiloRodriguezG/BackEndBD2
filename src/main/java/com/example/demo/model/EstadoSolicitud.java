package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"ESTADO_SOLICITUD\"")
public class EstadoSolicitud {
    @Id
    @GeneratedValue
    private int id_estado_solicitud;
    @Column
    private String estado_solicitud;

    /*SETTERS */
    public void setId_estado(int id_estado) {
        this.id_estado_solicitud = id_estado;
    }
    public void setEstado(String estado) {
        this.estado_solicitud = estado;
    }

    /*GETTERS */
    public int getId_estado() {
        return id_estado_solicitud;
    }
    public String getEstado() {
        return estado_solicitud;
    }
}
