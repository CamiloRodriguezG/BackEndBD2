package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"Estudiante\"")
public class Estudiante {
    
    @Id
    private String id_codigo;
    @Column
    private String programa_academico;
    @Column
    private int num_matriculas;
    @Column
    private String facultad;
    @Column
    private String n_estudiante;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado id_estado;

    /*SETTERS */
    public void setCodigo(String codigo) {
        this.id_codigo = codigo;
    }
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    public void setEstado(Estado estado) {
        this.id_estado = estado;
    }
    public void setNum_matriculas(int num_matriculas) {
        this.num_matriculas = num_matriculas;
    }
    public void setN_estudiante(String n_estudiante) {
        this.n_estudiante = n_estudiante;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    /*GETTERS */
    public String getCodigo() {
        return id_codigo;
    }
    public String getPrograma_academico() {
        return programa_academico;
    }
    public int getNum_matriculas() {
        return num_matriculas;
    }
    public String getN_estudiante() {
        return n_estudiante;
    }
    public Estado getEstado() {
        return id_estado;
    }
    public String getFacultad() {
        return facultad;
    }
    

}
