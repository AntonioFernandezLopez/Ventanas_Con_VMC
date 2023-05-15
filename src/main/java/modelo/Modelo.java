/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Antonio <2860075@alu.murciaeduca.es>
 */
public class Modelo {

    private Double moneda;
    private Double cantidad;
    private Double resultado;

    public Double getResultado() {
        return resultado;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public void convertirAMoneda() {
        this.resultado = moneda * cantidad;
    }
}
