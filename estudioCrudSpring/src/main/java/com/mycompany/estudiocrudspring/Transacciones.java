/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiocrudspring;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author ramir
 */
public class Transacciones {
    @JsonProperty("IDTransaccion")
    private String IDTransaccion;
    @JsonProperty("NumeroCuenta")
    private String NumeroCuenta;
    @JsonProperty("TipoTransaccion")
    private String TipoTransaccion;
    @JsonProperty("Monto")
    private String Monto;
    @JsonProperty("FechaTransaccion")
    private String FechaTransaccion;

    public Transacciones() {
    }

    public Transacciones(String IDTransaccion, String NumeroCuenta, String TipoTransaccion, String Monto, String FechaTransaccion) {
        this.IDTransaccion = IDTransaccion;
        this.NumeroCuenta = NumeroCuenta;
        this.TipoTransaccion = TipoTransaccion;
        this.Monto = Monto;
        this.FechaTransaccion = FechaTransaccion;
    }
     

    public String getIDTransaccion() {
        return IDTransaccion;
    }

    public void setIDTransaccion(String IDTransaccion) {
        this.IDTransaccion = IDTransaccion;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getFechaTransaccion() {
        return FechaTransaccion;
    }

    public void setFechaTransaccion(String FechaTransaccion) {
        this.FechaTransaccion = FechaTransaccion;
    }
    
    
}
