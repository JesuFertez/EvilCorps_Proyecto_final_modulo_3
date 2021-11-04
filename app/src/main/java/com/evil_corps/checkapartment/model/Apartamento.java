package com.evil_corps.checkapartment.model;

public class Apartamento {

    private String nombreEdificio;
    private String nombreProyecto;
    private String numeroDepto;
    private String direccion;
    private String urlImagenEdificio;

    public Apartamento(String nombreEdificio, String nombreProyecto, String numeroDepto, String direccion, String urlImagenEdificio) {
        this.nombreEdificio = nombreEdificio;
        this.nombreProyecto = nombreProyecto;
        this.numeroDepto = numeroDepto;
        this.direccion = direccion;
        this.urlImagenEdificio = urlImagenEdificio;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNumeroDepto() {
        return numeroDepto;
    }

    public void setNumeroDepto(String numeroDepto) {
        this.numeroDepto = numeroDepto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrlImagenEdificio() {
        return urlImagenEdificio;
    }

    public void setUrlImagenEdificio(String urlImagenEdificio) {
        this.urlImagenEdificio = urlImagenEdificio;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "nombreEdificio='" + nombreEdificio + '\'' +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", numeroDepto='" + numeroDepto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", urlImagenEdificio='" + urlImagenEdificio + '\'' +
                '}';
    }
}
