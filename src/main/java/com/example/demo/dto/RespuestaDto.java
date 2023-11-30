package com.example.demo.dto;

import com.example.demo.model.Respuesta;
import com.example.demo.model.RespuestaID;

public class RespuestaDto {

    private int id_requerimiento;
    private int id_solicitud;
    private String respuesta;
    public RespuestaDto(int id_requerimiento, int id_solicitud, String respuesta) {
        this.id_requerimiento = id_requerimiento;
        this.id_solicitud = id_solicitud;
        this.respuesta = respuesta;
    }
    public int getId_requerimiento() {
        return id_requerimiento;
    }
    public void setId_requerimiento(int id_requerimiento) {
        this.id_requerimiento = id_requerimiento;
    }
    public int getId_solicitud() {
        return id_solicitud;
    }
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Respuesta getResuestaFromDto(){

        Respuesta respuestaObj = new Respuesta();
        RespuestaID respuestaPK = new RespuestaID(id_requerimiento, id_solicitud);
        respuestaObj.setRespuestaPK(respuestaPK);
        respuestaObj.setRespuesta(respuesta);
        return respuestaObj;
    }
    
}
