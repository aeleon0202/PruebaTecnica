package com.example.polizasApiRest;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class PolizasUse {
    @Id
    private Long numPoliza;
    private String nombrePoliza;
    private String cobertura;
    private String fechaPoliza;
    private double valor;

    public PolizasUse(Long numPoliza, String nombrePoliza, String cobertura, String fechaPoliza, double valor) {
        this.numPoliza = numPoliza;
        this.nombrePoliza = nombrePoliza;
        this.cobertura = cobertura;
        this.fechaPoliza = fechaPoliza;
        this.valor = valor;
    }

    public PolizasUse() {
    }

    public Long getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Long numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getNombrePoliza() {
        return nombrePoliza;
    }

    public void setNombrePoliza(String nombrePoliza) {
        this.nombrePoliza = nombrePoliza;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getFechaPoliza() {
        return fechaPoliza;
    }

    public void setFechaPoliza(String fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolizasUse that = (PolizasUse) o;
        return Double.compare(that.valor, valor) == 0 && numPoliza.equals(that.numPoliza) && nombrePoliza.equals(that.nombrePoliza) && cobertura.equals(that.cobertura) && fechaPoliza.equals(that.fechaPoliza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPoliza, nombrePoliza, cobertura, fechaPoliza, valor);
    }

    @Override
    public String toString() {
        return "PolizasUse{" +
                "numPoliza=" + numPoliza +
                ", nombrePoliza='" + nombrePoliza + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", fechaPoliza='" + fechaPoliza + '\'' +
                ", valor=" + valor +
                '}';
    }
}
