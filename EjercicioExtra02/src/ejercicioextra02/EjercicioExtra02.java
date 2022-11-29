/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra02;

import Entidad.Puntos;
import Servicio.ServicePuntos;

/**
 *
 * @author feder
 */
public class EjercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Puntos p = new Puntos();
       ServicePuntos serv = new ServicePuntos();
       serv.crearPuntos(p);
        System.out.println(p);
        System.out.println("La distancia entre los puntos es: "+serv.distanciaPuntos(p));
       
    }
    
}
