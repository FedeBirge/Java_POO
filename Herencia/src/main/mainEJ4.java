/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author feder
 */
public class mainEJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Circulo c = new Circulo(5d);
    Rectangulo r = new Rectangulo(2, 10);
        System.out.println("El area del circulo es: "+c.area());
        System.out.println("El perimetro del circulo es: "+c.perimetro());
           System.out.println("El area del rectangulo es: "+r.area());
        System.out.println("El perimetro del rectangulo es: "+r.perimetro());
    }
    
}
