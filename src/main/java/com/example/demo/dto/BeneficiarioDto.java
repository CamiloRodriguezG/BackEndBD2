package com.example.demo.dto;

import com.example.demo.model.Beneficiario;
import com.example.demo.model.BeneficiarioID;

public class BeneficiarioDto {

    private String id_codigo;
    private int id_solicitud;
    private String estado_servicio;
    private String email;
    private int id_plan;
    private int id_tipo_apoyo;
    private int id_servicio;
    
    public BeneficiarioDto(String id_codigo, int id_solicitud, String estado_servicio, String email, int id_plan,
            int id_tipo_apoyo, int id_servicio) {
        this.id_codigo = id_codigo;
        this.id_solicitud = id_solicitud;
        this.estado_servicio = estado_servicio;
        this.email = email;
        this.id_plan = id_plan;
        this.id_tipo_apoyo = id_tipo_apoyo;
        this.id_servicio = id_servicio;
    }

    public String getId_codigo() {
        return id_codigo;
    }

    public void setId_codigo(String id_codigo) {
        this.id_codigo = id_codigo;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getEstado_servicio() {
        return estado_servicio;
    }

    public void setEstado_servicio(String estado_servicio) {
        this.estado_servicio = estado_servicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }

    public int getId_tipo_apoyo() {
        return id_tipo_apoyo;
    }

    public void setId_tipo_apoyo(int id_tipo_apoyo) {
        this.id_tipo_apoyo = id_tipo_apoyo;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Beneficiario getBeneficiarioFromDto(){
        Beneficiario beneficiario = new Beneficiario();
        BeneficiarioID beneficiarioID = new BeneficiarioID(id_codigo, id_solicitud);
        beneficiario.setPrimaryKeyBeneficiario(beneficiarioID);
        beneficiario.setEstado_servicio(estado_servicio);
        beneficiario.setEmail(email);
        return beneficiario;
    }

}
