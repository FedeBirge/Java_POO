/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;

/**
 *
 * @author feder
 */
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
public class MatematicaService {

    public void crearNumeros(Matematica num) {
        num.setN1((float) (Math.random() * -10));
        num.setN2((float) (Math.random() * 10));
    }

    public float devolverMayor(Matematica num) {
        return max(num.getN1(), num.getN2());   
       }
    public float devolverMenor(Matematica num) {
        return min(num.getN1(), num.getN2());   
       }
    public float calcularPotencia(Matematica num){
        float n1, n2;
        n1=round(devolverMayor(num));
        n2=round(devolverMenor(num));
        return (int) Math.pow(n1,n2);
    }
     public float calcularRaiz(Matematica num){
        float n;
        
        n=Math.abs(round(devolverMenor(num)));
        return (float) Math.sqrt(n);
    }
}
