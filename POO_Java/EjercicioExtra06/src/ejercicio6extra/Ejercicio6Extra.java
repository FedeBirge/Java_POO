/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6extra;

import Entidad.Ahorcado;
import Servicio.ServiceAhorcado;

/**
 *
 * @author feder
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado ah = new Ahorcado();
        ServiceAhorcado serv = new ServiceAhorcado();
        serv.juego(ah);
    }
    
}
