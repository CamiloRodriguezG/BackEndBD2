package com.example.demo.dto;

import com.example.demo.model.Estudiante;

public class EstudianteDto {
    
    private long codigo;
    private String programa_academico;
    private int matriculas;
    private String estado;
    private String facultad;


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

    public EstudianteDto(long codigo, String programa_academico, int matriculas, String estado, String facultad) {
        this.codigo = codigo;
        this.programa_academico = programa_academico;
        this.matriculas = matriculas;
        this.estado = estado;
        this.facultad = facultad;
    }

    public Estudiante getEstudianteFromDto(){
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(codigo);
        estudiante.setPrograma_academico(programa_academico);
        estudiante.setMatriculas(matriculas);
        estudiante.setEstado(estado);
        estudiante.setFacultad(facultad);

        return estudiante;
    }
}
