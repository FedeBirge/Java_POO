/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrareloj;

import Entidad.Tiempo;
import Servicio.ServiceTiempo;
import java.util.Timer;


/**
 *
 * @author feder
 */
public class ExtraReloj {

    /**
     * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos.
     * Definir dos constructores: un constructor vacío y otro con la hora,
     * minutos y segundos ingresado por el usuario. Deberá definir además, los
     * métodos getters y setters correspondientes, y el método
     * imprimirHoraCompleta(). Recordar crear una validación sobre las horas,
     * minutos y segundos ingresados por el usuario. Te animas a simular el paso
     * del tiempo en consola??????
     *
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ServiceTiempo serTiem = new ServiceTiempo();
        
        serTiem.reloj();

        

    }

}
