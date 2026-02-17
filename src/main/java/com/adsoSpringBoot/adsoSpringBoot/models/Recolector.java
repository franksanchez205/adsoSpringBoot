package com.adsoSpringBoot.adsoSpringBoot.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recolector {
    @Id
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String cedula;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 50)
    private String apellidos;
    private String clave;
    private String correo;
    private Date fechaRegistro;

    public Recolector(String cedula, String nombre, String apellidos, String clave, String correo,
            Date fechaRegistro) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
    }

    public Recolector() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
