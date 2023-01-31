/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Entidad.Jugador;
import Entidad.Revolver;


/**
 *
 * @author feder
 */
public class ServiceJugador {
    
//    El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
    
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
   public boolean disparo(Revolver r, Jugador j){
       ServiceRevolver servRev = new ServiceRevolver();
       if (servRev.mojar(r)) {
           j.setMojado(true);
           return true;
           
       } else {
           servRev.siguienteChorro(r);
           return false;
       }
   }
    
}
