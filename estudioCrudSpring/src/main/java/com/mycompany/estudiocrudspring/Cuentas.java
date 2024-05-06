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
public class Cuentas {
    @JsonProperty("NumeroCuenta")
    private String NumeroCuenta;
    @JsonProperty("NombreCliente")
    private String NombreCliente;
    @JsonProperty("Saldo")
    private double Saldo;

    public Cuentas() {
    }

    public Cuentas(String NumeroCuenta, String NombreCliente, double Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.NombreCliente = NombreCliente;
        this.Saldo = Saldo;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
