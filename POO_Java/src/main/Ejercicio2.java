/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Circunferencia;
import Servicio.ServiceCircunferencia;

/**
 *
 * @author feder
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              ServiceCircunferencia C = new  ServiceCircunferencia();
            Circunferencia cir = C.crearCircunferencia();
        
        System.out.println("El area es: " + C.area(cir));
        System.out.println("El perimetro es: " + C.perimetro(cir));
    }
    
}
