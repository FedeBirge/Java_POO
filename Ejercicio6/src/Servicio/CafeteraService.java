/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author feder
 */
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
//recibe y se añade a la cafetera la cantidad de café indicada
public class CafeteraService {
    public Cafetera llenarCafetera(){
        Cafetera cafe= new Cafetera();
        cafe.setCapacidadActual(cafe.getCapacidadMax());
        return cafe;
    }
    
    public void servirTaza(Cafetera caf, int taza){
        if(caf.getCapacidadActual()>=taza){
            System.out.println("Se llenó la taza");
            caf.setCapacidadActual(caf.getCapacidadActual()-taza);
        }
        else {
            System.out.println("No hay suficiente café para completar la taza");
            System.out.println("LA taza tiene  " + caf.getCapacidadActual()+" de café");
            caf.setCapacidadActual(0);
        }
    }
    public void vaciarCafetera(Cafetera caf){
        caf.setCapacidadActual(0);
    }
    public void agregarCafe(Cafetera caf, int cafe){
        if(cafe + caf.getCapacidadActual()>caf.getCapacidadMax()){
            caf.setCapacidadActual(caf.getCapacidadMax());
        }
        else{
        caf.setCapacidadActual(caf.getCapacidadActual()+cafe);
            }
    }
}
