package com.example.polizasApiRest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Vehiculos {

    @Id
    private String placa;
    private String modelo;
    private boolean inspeccion;

    public Vehiculos(String placa, String modelo, boolean inspeccion) {
        this.placa = placa;
        this.modelo = modelo;
        this.inspeccion = inspeccion;
    }

    public Vehiculos() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(boolean inspeccion) {
        this.inspeccion = inspeccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculos vehiculos = (Vehiculos) o;
        return inspeccion == vehiculos.inspeccion && placa.equals(vehiculos.placa) && modelo.equals(vehiculos.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, modelo, inspeccion);
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", inspeccion=" + inspeccion +
                '}';
    }
}
