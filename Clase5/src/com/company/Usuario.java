package com.company;

import java.util.Arrays;

public class Usuario {

    private String nombre;
    private int idUsuario;
    private String tipoSuscripcion;

    public Usuario(String nombre, int idUsuario, String tipoSuscripcion) throws Exception {
        if (!Arrays.asList(ServicioDescarga.tipoUsuario).contains(tipoSuscripcion)) {
            throw new Exception("No es una suscripción válida");
        }
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public Usuario() {
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public void peticionDescarga(Proxy proxy) {
        proxy.descargar(this);
    }



}
