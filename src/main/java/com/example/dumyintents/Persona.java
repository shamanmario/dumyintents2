package com.example.dumyintents;

import java.io.Serializable;

public class Persona implements Serializable {
    private String rut;

    public Persona(String rut) {
        this.rut = rut;
    }

    public Persona() {
        this.rut = "Sin Rut";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
