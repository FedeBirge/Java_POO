/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entidad.Persona;
import Servicio.PersonaService;
import java.sql.Time;
import java.time.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author feder
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
//       Persona per = new Persona();
//       PersonaService serv = new PersonaService();
//       serv.crearPersona(per);
//        System.out.println("");
//        System.out.println("La edad es:"+serv.calcularEdad(per));
//         System.out.println("");
//        serv.mostrarPesona(per);
        Time t = null ;
        Date ahora = new Date();
        
        while (true) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                   Instant ahora= Instant.now();
               
                 System.out.println(ahora.toString());

                }
            }, 1000); //Cada 3 segundos
         
        }
    }

}
