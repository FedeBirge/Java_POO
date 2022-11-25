/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
//    . Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
//puede conseguir instanciando un objeto Date con constructor vacío. 
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
    public static void main(String[] args) {
        int anio,mes,dia;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un anio: ");
        anio=scan.nextInt();
         System.out.println("Ingrese un mes: ");
        mes=scan.nextInt();
         System.out.println("Ingrese un dia: ");
        dia=scan.nextInt();
        
        Date fecha = new Date(anio-1900, mes, dia);
        Date fechaActual = new Date();
        System.out.println(fecha);
         System.out.println(fechaActual.toString());
        System.out.println("Anios entre fechas:"+(fechaActual.getYear()-fecha.getYear()) );
        
    }
    
}
