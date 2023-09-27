package com.example.demo.dto;

import com.example.demo.model.Evaluador;

public class EvaluadorDto {
    
    private String id_evaluador;
    private String n_evaluador;

    /*CONSTRUCTOR */
    public EvaluadorDto(String id_evaluador, String n_evaluador) {
        this.id_evaluador = id_evaluador;
        this.n_evaluador = n_evaluador;
    }

    /*GETTERS */
    public String getId_evaluador() {
        return id_evaluador;
    }
    public String getN_evaluador() {
        return n_evaluador;
    }

    /*SETTERS */
    public void setId_evaluador(String id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
    public void setN_evaluador(String n_evaluador) {
        this.n_evaluador = n_evaluador;
    }

    public Evaluador getEvaluadorFromDto(){
        Evaluador evaluador = new Evaluador();
        evaluador.setId_evaluador(id_evaluador);
        evaluador.setN_evaluador(n_evaluador);
        return evaluador;
    }
    
}
