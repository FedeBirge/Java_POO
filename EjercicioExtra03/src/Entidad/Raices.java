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
//. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
//Hay que insertar estos 3 valores para construir el objeto a través de un método 
//constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
public class Raices {
    private int a,c,b;

    public Raices() {
        
    }

    public Raices(int a, int c, int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", c=" + c + ", b=" + b + '}';
    }
    
    
}
