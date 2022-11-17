/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author feder
 */
// Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
public class Circunferencia {
    private float radio;
    
    public Circunferencia(){
        
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
}
