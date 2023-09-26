package com.example.demo.dto;

import com.example.demo.model.Solicitud;

public class SolicitudDto {
    
    private int id_solicitud;
    private String estado;
    private String puntaje;

    /*CONSTRUCTOR */
    public SolicitudDto(int id_solicitud, String estado, String puntaje) {
        this.id_solicitud = id_solicitud;
        this.estado = estado;
        this.puntaje = puntaje;
    }

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

    public Solicitud getSolicitudFromDto(){
        Solicitud solicitud = new Solicitud();
        solicitud.setId_solicitud(id_solicitud);
        solicitud.setEstado(estado);
        solicitud.setPuntaje(puntaje);

        return solicitud;
    }

}
