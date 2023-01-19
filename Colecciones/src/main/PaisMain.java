/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Service.ServicePais;

/**
 *
 * @author feder
 */
public class PaisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicePais serv = new ServicePais();
        serv.cargarPaises();
        System.out.println("");
        serv.mostrarPaises();
        serv.buscarPais();
        
    }
    
}
