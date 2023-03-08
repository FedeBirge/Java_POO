/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import Entidad.Movil;
import Servicio.ServiceMovil;

/**
 *
 * @author feder
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movil mov = new Movil();
        ServiceMovil serv = new ServiceMovil();
        serv.cargarCelular(mov);
        System.out.println(mov);
    }
    
}
