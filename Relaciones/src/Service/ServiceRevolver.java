/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Revolver;

/**
 *
 * @author feder
 */
public class ServiceRevolver {
    
    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
 //Los valores //deben ser aleatorios.
   public void llenarRevolver(Revolver r){
       r.setPosActual((int)(Math.random()*6)+1);
       r.setPosAgua((int)(Math.random()*6)+1);
   }
    
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
   public boolean mojar(Revolver r){
       return (r.getPosActual()== r.getPosAgua());
   }
//• siguienteChorro(): cambia a la siguiente posición del tambor
   
   public void siguienteChorro(Revolver r){
       if (r.getPosActual()==6) {
           r.setPosActual(1);
       } else {
           r.setPosActual(r.getPosActual()+1);
       }
   }
    
}
