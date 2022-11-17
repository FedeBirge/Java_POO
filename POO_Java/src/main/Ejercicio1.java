/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import Entidad.Libro;
import Servicio.ServiceLibro;

/**
 *
 * @author feder
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ServiceLibro LL = new ServiceLibro();
        Libro L1 = LL.cargarLibro();
        System.out.println(L1);
    }

}
