package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"EVALUADOR\"")
public class Evaluador {
    @Id
    private String id_evaluador;
    @Column
    private String n_evaluador;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado id_estado;
    
    /*GETTERS */
    public String getId_evaluador() {
        return id_evaluador;
    }
    public String getN_evaluador() {
        return n_evaluador;
    }
    public Estado getEstado() {
        return id_estado;
    }

    /*SETTERS */
    public void setId_evaluador(String id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
    public void setN_evaluador(String n_evaluador) {
        this.n_evaluador = n_evaluador;
    }
    public void setEstado(Estado estado) {
        this.id_estado = estado;
    }

    

}
