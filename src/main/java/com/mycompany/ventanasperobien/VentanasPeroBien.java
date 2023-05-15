/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ventanasperobien;

import controlador.Controlador;
import modelo.Modelo;
import vistas.Vista;

/**
 *
 * @author Antonio <2860075@alu.murciaeduca.es>
 */
public class VentanasPeroBien {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador c = new Controlador(modelo,vista);
        
    }
}
