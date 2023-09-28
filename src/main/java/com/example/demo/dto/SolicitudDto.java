package com.example.demo.dto;

import com.example.demo.model.Solicitud;

public class SolicitudDto {
    private int id_solicitud;
    private int puntaje;
    private int ingresos_familiares;
    private String sostiene_hogar;
    private String vive_fuera_familia;
    private String se_autosustenta;
    private String personas_acargo;
    private String vive_empleador;
    private String condicion_especial;
    private String zona_vulnerabilidad;
    private String discapacidad;
    private String problema_alimentario;
    private int valor_matricula;
    private int id_estado_solicitud;
    private String id_codigo;
    private String id_evaluador;
    private String id_periodo;

    public SolicitudDto(int id_solicitud, int puntaje, int ingresos_familiares, String sostiene_hogar,
            String vive_fuera_familia, String se_autosustenta, String personas_acargo, String vive_empleador,
            String condicion_especial, String zona_vulnerabilidad, String discapacidad, String problema_alimentario,
            int valor_matricula, int id_estado_solicitud, String id_codigo, String id_evaluador, String id_periodo) {
        this.id_solicitud = id_solicitud;
        this.puntaje = puntaje;
        this.ingresos_familiares = ingresos_familiares;
        this.sostiene_hogar = sostiene_hogar;
        this.vive_fuera_familia = vive_fuera_familia;
        this.se_autosustenta = se_autosustenta;
        this.personas_acargo = personas_acargo;
        this.vive_empleador = vive_empleador;
        this.condicion_especial = condicion_especial;
        this.zona_vulnerabilidad = zona_vulnerabilidad;
        this.discapacidad = discapacidad;
        this.problema_alimentario = problema_alimentario;
        this.valor_matricula = valor_matricula;
        this.id_estado_solicitud = id_estado_solicitud;
        this.id_codigo = id_codigo;
        this.id_evaluador = id_evaluador;
        this.id_periodo = id_periodo;
    }

    



    public int getId_solicitud() {
        return id_solicitud;
    }





    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }





    public int getPuntaje() {
        return puntaje;
    }





    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }





    public int getIngresos_familiares() {
        return ingresos_familiares;
    }





    public void setIngresos_familiares(int ingresos_familiares) {
        this.ingresos_familiares = ingresos_familiares;
    }





    public String getSostiene_hogar() {
        return sostiene_hogar;
    }





    public void setSostiene_hogar(String sostiene_hogar) {
        this.sostiene_hogar = sostiene_hogar;
    }





    public String getVive_fuera_familia() {
        return vive_fuera_familia;
    }





    public void setVive_fuera_familia(String vive_fuera_familia) {
        this.vive_fuera_familia = vive_fuera_familia;
    }





    public String getSe_autosustenta() {
        return se_autosustenta;
    }





    public void setSe_autosustenta(String se_autosustenta) {
        this.se_autosustenta = se_autosustenta;
    }





    public String getPersonas_acargo() {
        return personas_acargo;
    }





    public void setPersonas_acargo(String personas_acargo) {
        this.personas_acargo = personas_acargo;
    }





    public String getVive_empleador() {
        return vive_empleador;
    }





    public void setVive_empleador(String vive_empleador) {
        this.vive_empleador = vive_empleador;
    }





    public String getCondicion_especial() {
        return condicion_especial;
    }





    public void setCondicion_especial(String condicion_especial) {
        this.condicion_especial = condicion_especial;
    }





    public String getZona_vulnerabilidad() {
        return zona_vulnerabilidad;
    }





    public void setZona_vulnerabilidad(String zona_vulnerabilidad) {
        this.zona_vulnerabilidad = zona_vulnerabilidad;
    }





    public String getDiscapacidad() {
        return discapacidad;
    }





    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }





    public String getProblema_alimentario() {
        return problema_alimentario;
    }





    public void setProblema_alimentario(String problema_alimentario) {
        this.problema_alimentario = problema_alimentario;
    }





    public int getValor_matricula() {
        return valor_matricula;
    }





    public void setValor_matricula(int valor_matricula) {
        this.valor_matricula = valor_matricula;
    }





    public int getId_estado_solicitud() {
        return id_estado_solicitud;
    }





    public void setId_estado_solicitud(int id_estado_solicitud) {
        this.id_estado_solicitud = id_estado_solicitud;
    }





    public String getId_codigo() {
        return id_codigo;
    }





    public void setId_codigo(String id_codigo) {
        this.id_codigo = id_codigo;
    }





    public String getId_evaluador() {
        return id_evaluador;
    }





    public void setId_evaluador(String id_evaluador) {
        this.id_evaluador = id_evaluador;
    }





    public String getId_periodo() {
        return id_periodo;
    }





    public void setId_periodo(String id_periodo) {
        this.id_periodo = id_periodo;
    }





    public Solicitud getSolicitudFromDto(){
        Solicitud solicitud = new Solicitud();
        // solicitud.setId_solicitud(id_solicitud);
        solicitud.setPuntaje(puntaje);
        solicitud.setIngresos_familiares(ingresos_familiares);
        solicitud.setSostiene_hogar(sostiene_hogar);
        solicitud.setVive_fuera_familia(vive_fuera_familia);
        solicitud.setSe_autosustenta(se_autosustenta);
        solicitud.setPersonas_acargo(personas_acargo);
        solicitud.setVive_empleador(vive_empleador);
        solicitud.setCondicion_especial(condicion_especial);
        solicitud.setZona_vulnerabilidad(zona_vulnerabilidad);
        solicitud.setDiscapacidad(discapacidad);
        solicitud.setProblema_alimentario(problema_alimentario);
        solicitud.setValor_matricula(valor_matricula);
        solicitud.setId_codigo(id_codigo);
        solicitud.setId_estado_solicitud(id_estado_solicitud);
        solicitud.setId_periodo(id_periodo);
        solicitud.setId_evaluador(id_evaluador);
        return solicitud;
    }

}
