/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      CafeteraService cafeserv = new CafeteraService();
      Cafetera caf =cafeserv.llenarCafetera();
        System.out.println("Ingrese el tamaño de la taza a llenar: ");
        cafeserv.servirTaza(caf, scan.nextInt());
        System.out.println(caf);
        cafeserv.vaciarCafetera(caf);
        System.out.println(caf);
        System.out.println("Ingrese una cantidad de café para cargar: ");
        cafeserv.agregarCafe(caf,scan.nextInt());
          System.out.println(caf);
    }
    
}
