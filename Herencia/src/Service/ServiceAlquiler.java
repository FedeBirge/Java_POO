/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alquiler;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceAlquiler {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
//    Un alquiler se calcula multiplicando el número de días de ocupación
//   (calculado con la fecha de alquiler y devolución)  
//    por un valor módulo de cada barco 

    public long calcularAlquiler(Alquiler a) {

        return a.getBarco().calcularModulo() * (ChronoUnit.DAYS.between(a.getFechaAlquila(), a.getFechaDevuelve()));
    }
public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }
    public void menuAlquiler() {

        System.out.println("*-----------Tipos de barco a alquilar-----------*");
        System.out.println("1. Velero");
        System.out.println("2. Barco a Motor");
        System.out.println("3. Yate");
        System.out.println("");
        System.out.println("Elija una opcion numerica:");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                Velero v = new Velero(5, "EE5656", 30, 2013);
                Alquiler al = new Alquiler("Fede", "25457874", LocalDate.now(), LocalDate.parse("2023-04-16"), 5, v);
                System.out.println("El valor de alquiler del velero es: " + calcularAlquiler(al));
                System.out.println(al);
                System.out.println("");
                break;
            case 2:
                BarcoMotor b = new BarcoMotor(250, "AA456", 50, 2010);
                Alquiler al1 = new Alquiler("Fede", "25457874", LocalDate.parse("2023-02-19"), LocalDate.parse("2023-03-16"), 8, b);
                System.out.println("El valor de alquiler del barco a motor es: " + calcularAlquiler(al1));
                     System.out.println(al1);
                System.out.println("");
                break;
            case 3:
                Yate y = new Yate(500, 3, "HH5676", 40, 2018);    
                Alquiler al2 = new Alquiler("Fede", "25457874", LocalDate.parse("2023-01-11"), LocalDate.parse("2023-03-16"), 6, y);
                System.out.println("El valor de alquiler del yate es: " + calcularAlquiler(al2));
                System.out.println(al2);
                System.out.println("");
                break;
            default:
                System.out.println("Opcion Incorrecta!!!");                
                presioneTecla();
                menuAlquiler();
                break;
        }
    }

}
