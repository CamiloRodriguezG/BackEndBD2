package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estado {
    @Id
    private int id_estado;
    @Column
    private String estado;

    /*SETTERS */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*GETTERS */
    public int getId_estado() {
        return id_estado;
    }
    public String getEstado() {
        return estado;
    }
    
}
