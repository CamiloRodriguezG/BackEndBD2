package com.example.demo.dto;

import com.example.demo.model.Estudiante;

public class EstudianteDto {
    
    private String codigo;
    private String programa_academico;
    private int num_matriculas;
    private String facultad;
    private String n_estudiante;

    
    /*CONTRUCTOR */
    public EstudianteDto(String codigo, String programa_academico, int num_matriculas, String facultad,
            String n_estudiante) {
        this.codigo = codigo;
        this.programa_academico = programa_academico;
        this.num_matriculas = num_matriculas;
        this.facultad = facultad;
        this.n_estudiante = n_estudiante;
    }

    /*GETTERS */
    public String getCodigo() {
        return codigo;
    }
    public String getPrograma_academico() {
        return programa_academico;
    }
    public int getNum_matriculas() {
        return num_matriculas;
    }
    public String getFacultad() {
        return facultad;
    }
    public String getN_estudiante() {
        return n_estudiante;
    }

    /*SETTERS */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    public void setNum_matriculas(int num_matriculas) {
        this.num_matriculas = num_matriculas;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void setN_estudiante(String n_estudiante) {
        this.n_estudiante = n_estudiante;
    }

    public Estudiante getEstudianteFromDto(){
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(codigo);
        estudiante.setPrograma_academico(programa_academico);
        estudiante.setNum_matriculas(num_matriculas);
        estudiante.setFacultad(facultad);
        estudiante.setN_estudiante(n_estudiante);
        return estudiante;
    }
}
