package org.example;

import java.util.Date;

public class persona {
    protected String nombre;
    protected String estadoAsis;
    char genero;
    Date fechaReg;

    public persona(){}

    public persona(String nombre, String estadoAsis, Date fechaReg){
        this.nombre = nombre;
        this.estadoAsis = estadoAsis;
        this.fechaReg = fechaReg;
    }

    public persona(String nombre, String estadoAsis, char genero) {
        this.nombre = nombre;
        this.estadoAsis = estadoAsis;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoAsis() {
        return estadoAsis;
    }

    public void setEstadoAsis(String estadoAsis) {
        this.estadoAsis = estadoAsis;
    }

    @Override
    public String toString() {
        return this.nombre +"\t"+ this.estadoAsis +"\t"+ this.fechaReg;
    }
}
