/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vistas.Vista;

/**
 *
 * @author Antonio <2860075@alu.murciaeduca.es>
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;
    private Double cantidad;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.BotonPesetas.addActionListener(this);
        this.vista.BotonDolares.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.BotonPesetas == e.getSource()){
            if(!"".equals(vista.jLabelCambioMoneda.getText())){
                try{
                    
                }catch(){
                    
                }
            }
        }
    }
    
    
}
