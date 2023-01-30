/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.DNI;
import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author feder
 */
public class ManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
    Persona p1 = new Persona("Juan", "PErez", 25, null  , new Perro("chiquito", "beagle",5, "MEDIO"));
    Persona p2 = new Persona("Maria", "Lopez", 33, null, new Perro("pepa", "caniche", 4, "CHICO"));
        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
        
    
  
    }
    
}
