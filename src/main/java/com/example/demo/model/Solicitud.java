package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Solicitud {

    @Id
    private int id_solicitud;
    @Column
    private String estado;
    @Column
    private int puntaje;
    @Column
    private int ingresos_familiares;
    @Column
    private String sostiene_hogar;
    @Column
    private String vive_fuera_familia;
    @Column
    private String se_autosustenta;
    @Column
    private String personas_acargo;
    @Column
    private String vive_empleador;
    @Column
    private String condicion_especial;
    @Column
    private String zona_vulnerabilidad;
    @Column
    private String discapacidad;
    @Column
    private String problema_alimentario;
    @Column
    private int valor_matricula;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_estado_solicitud")
    private EstadoSolicitud id_estado_solicitud;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_codigo")
    private Estudiante id_codigo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_evaluador")
    private Evaluador id_evaluador;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Convocatoria id_periodo;

    /*GETTERS */
    public int getId_solicitud() {
        return id_solicitud;
    }
    public String getEstado() {
        return estado;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public Estudiante getId_codigo() {
        return id_codigo;
    }
    public Evaluador getId_evaluador() {
        return id_evaluador;
    }
    public Convocatoria getId_periodo() {
        return id_periodo;
    }
    public int getIngresos_familiares() {
        return ingresos_familiares;
    }
    public String getSostiene_hogar() {
        return sostiene_hogar;
    }
    public String getVive_fuera_familia() {
        return vive_fuera_familia;
    }
    public String getSe_autosustenta() {
        return se_autosustenta;
    }
    public String getPersonas_acargo() {
        return personas_acargo;
    }
    public String getVive_empleador() {
        return vive_empleador;
    }
    public String getCondicion_especial() {
        return condicion_especial;
    }
    public String getZona_vulnerabilidad() {
        return zona_vulnerabilidad;
    }
    public String getDiscapacidad() {
        return discapacidad;
    }
    public String getProblema_alimentario() {
        return problema_alimentario;
    }
    public int getValor_matricula() {
        return valor_matricula;
    }
    public EstadoSolicitud getId_estado_solicitud() {
        return id_estado_solicitud;
    }
    /*SETTERS */
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public void setId_codigo(Estudiante id_codigo) {
        this.id_codigo = id_codigo;
    }
    public void setId_evaluador(Evaluador id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
    public void setId_periodo(Convocatoria id_periodo) {
        this.id_periodo = id_periodo;
    }
    public void setIngresos_familiares(int ingresos_familiares) {
        this.ingresos_familiares = ingresos_familiares;
    }
    public void setSostiene_hogar(String sostiene_hogar) {
        this.sostiene_hogar = sostiene_hogar;
    }
    public void setVive_fuera_familia(String vive_fuera_familia) {
        this.vive_fuera_familia = vive_fuera_familia;
    }
    public void setSe_autosustenta(String se_autosustenta) {
        this.se_autosustenta = se_autosustenta;
    }
    public void setPersonas_acargo(String personas_acargo) {
        this.personas_acargo = personas_acargo;
    }
    public void setVive_empleador(String vive_empleador) {
        this.vive_empleador = vive_empleador;
    }
    public void setCondicion_especial(String condicion_especial) {
        this.condicion_especial = condicion_especial;
    }
    public void setZona_vulnerabilidad(String zona_vulnerabilidad) {
        this.zona_vulnerabilidad = zona_vulnerabilidad;
    }
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
    public void setProblema_alimentario(String problema_alimentario) {
        this.problema_alimentario = problema_alimentario;
    }
    public void setValor_matricula(int valor_matricula) {
        this.valor_matricula = valor_matricula;
    }
    public void setId_estado_solicitud(EstadoSolicitud id_estado_solicitud) {
        this.id_estado_solicitud = id_estado_solicitud;
    }
    

}
