/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Service.ServiceProducto;

/**
 *
 * @author feder
 */
public class ProductoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceProducto serv = new ServiceProducto();
        serv.menu();
        
    }
    
}
