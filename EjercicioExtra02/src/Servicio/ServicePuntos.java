/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author feder
 */
// Generar un objeto puntos 
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
//que existe entre los dos puntos que existen en la clase Puntos.
public class ServicePuntos {
    Scanner scan = new Scanner(System.in);
    public void crearPuntos(Puntos p){
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("Coordenada horizontal x:");
        p.setX1(scan.nextInt());
        System.out.println("Coordenada vertical y: ");
        p.setY1(scan.nextInt());
        System.out.println("");
          System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("Coordenada horizontal x:");
        p.setX2(scan.nextInt());
        System.out.println("Coordenada vertical y: ");
        p.setY2(scan.nextInt());
        
    }
    public float distanciaPuntos(Puntos p){
        return (float) (Math.sqrt( Math.pow(p.getX2()-p.getX1(),2)+ Math.pow(p.getY2()-p.getY1(),2)));
    }
}
