/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

/**
 * Recordar crear una validación sobre las horas,
     * minutos y segundos ingresados por el usuario. Te animas a simular el paso
     * del tiempo en consola??????
 * @author feder
 */
public class ServiceTiempo {

    Scanner leer = new Scanner(System.in);

    public Tiempo crearTiempo() {
        Tiempo hora = new Tiempo();
        System.out.println("Coloca la hora actual, con minutos y segundos.");
        hora.setHs(hora());
        hora.setMin(minYSeg());
        hora.setSeg(minYSeg());
        return hora;

    }

    public int hora() {
        int hs;
        do {
            System.out.println("Ingresa la hora:");
            hs = leer.nextInt();
        } while (hs < 0 || hs > 24);
        return hs;
    }

    public int minYSeg() {
        int num;
        do {
            System.out.println("Ingresa dato:");
            num = leer.nextInt();
        } while (num < 0 || num > 59);
        return num;
    }

    public void inicializarTiempo(Tiempo tiempo) {
        do {

        } while (!(tiempo.getHs() == 24));
    }
  
   

    public void reloj() throws InterruptedException  {
        Tiempo tiempo = crearTiempo();
        while (true) {
   
            System.out.println(tiempo.toString());
            Thread.sleep(1000);
            if (tiempo.getSeg() == 59) {
                tiempo.setSeg(0);
                if (tiempo.getMin() == 59) {
                    tiempo.setMin(0);
                    if (tiempo.getHs() == 23)  {
                             tiempo.setHs(0);
                        } else {
                tiempo.setHs(tiempo.getHs()+1);
            }
                        
                }
                  else{
                tiempo.setMin(tiempo.getMin()+1);
            }
            } else {
                tiempo.setSeg(tiempo.getSeg() + 1);
            }
            
        }
    }
}
