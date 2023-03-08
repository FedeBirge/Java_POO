/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author feder
 */
//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
//actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual 
//• Métodos getters y setters
public class Cafetera {
    private float capacidadMax = 2000;
    private float capacidadActual;

    public Cafetera() {
    }

    public Cafetera(float capacidadMax, float capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public float getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(float capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public float getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(float capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", capacidadActual=" + capacidadActual + '}';
    }
    
    
}
