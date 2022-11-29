/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra03;

import Entidad.Raices;
import Servicio.ServiceRaices;

/**
 *
 * @author feder
 */
public class EjercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Raices r = new Raices();
       ServiceRaices serv = new ServiceRaices();
       serv.crearRaices(r);
        System.out.println("Discriminante: "+serv.getDiscriminante(r));
       serv.calcular(r);
       
    }
    
}
