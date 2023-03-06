/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author feder
 */
public class Ej1Excpciones {

    /**
     * @param args the command line arguments
     */
//    Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null 
//    y tratar de invocar el método esMayorDeEdad() a través de ese objeto. 
//    Luego, englobe el código con una cláusula try-catch para probar 
//            la nueva excepción que debe ser controlada.
    public static void main(String[] args) {
        try {
            PersonaService serv = new PersonaService();
            Persona p = null;
            serv.esMayorDeEdad(p);
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
