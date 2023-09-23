package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    
    @Id
    private long codigo;
    @Column
    private String programa_academico;
    @Column
    private int matriculas;
    @Column
    private String estado;
    @Column
    private String facultad;

    /*SETTERS */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    public void setMatriculas(int matriculas) {
        this.matriculas = matriculas;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    /*GETTERS */
    public long getCodigo() {
        return codigo;
    }
    public String getPrograma_academico() {
        return programa_academico;
    }
    public int getMatriculas() {
        return matriculas;
    }
    public String getEstado() {
        return estado;
    }
    public String getFacultad() {
        return facultad;
    }
    

}
