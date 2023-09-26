package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Solicitud {

    @Id
    private int id_solicitud;
    @Column
    private String estado;
    @Column
    private String puntaje;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_codigo")
    private Estudiante id_codigo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_evaluador")
    private Evaluador id_evaluador;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Convocatoria id_periodo;

    /*GETTERS */
    public int getId_solicitud() {
        return id_solicitud;
    }
    public String getEstado() {
        return estado;
    }
    public String getPuntaje() {
        return puntaje;
    }
    public Estudiante getId_codigo() {
        return id_codigo;
    }
    public Evaluador getId_evaluador() {
        return id_evaluador;
    }
    public Convocatoria getId_periodo() {
        return id_periodo;
    }

    /*SETTERS */
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }
    public void setId_codigo(Estudiante id_codigo) {
        this.id_codigo = id_codigo;
    }
    public void setId_evaluador(Evaluador id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
    public void setId_periodo(Convocatoria id_periodo) {
        this.id_periodo = id_periodo;
    }

}
