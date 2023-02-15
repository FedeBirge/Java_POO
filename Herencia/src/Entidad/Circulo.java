/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author feder
 */
public final class Circulo implements calculosFormas {
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }       

    @Override
    public Double area() {
//        Área circulo: PI * radio ^ 2
        return PI *radio*radio;
            }
    @Override
    public Double perimetro() {
        return PI*2*radio;
    }
    
}
