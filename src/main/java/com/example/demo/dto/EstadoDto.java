package com.example.demo.dto;

import com.example.demo.model.Estado;

public class EstadoDto {
    
    private int id_estado;
    private String estado;
    
    /*CONSTRUCTOR */
    public EstadoDto(int id_estado, String estado) {
        this.id_estado = id_estado;
        this.estado = estado;
    }

    /*GETTERS */
    public int getId_estado() {
        return id_estado;
    }
    public String getEstado() {
        return estado;
    }

    /*SETTERS */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estado getEstadoFromDto(){
        Estado estadoEnt = new Estado();
        estadoEnt.setId_estado(id_estado);
        estadoEnt.setEstado(estado);
        return estadoEnt;
    }
    

}
