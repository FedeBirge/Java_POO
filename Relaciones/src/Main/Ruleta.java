/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.Juego;

import Service.ServiceJuego;


/**
 *
 * @author feder
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceJuego serv = new ServiceJuego();
        Juego juego = serv.llenarJuego();
        serv.ronda(juego);
        
  
        
    }
    
}
