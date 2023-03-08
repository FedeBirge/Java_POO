/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Método getDiscriminante(): devuelve el valor del discriminante (double). El 
//discriminante tiene la siguiente formula: (b^2)-4*a*c 
//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
//que esto ocurra, el discriminante debe ser mayor o igual que 0. 
//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
//que esto ocurra, el discriminante debe ser igual que 0. 
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
//soluciones. 
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
//en el caso en que se tenga una única solución posible. 
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
//de no existir solución, se mostrará un mensaje. 
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
public class ServiceRaices {
    Scanner scan = new Scanner(System.in);
    public void crearRaices(Raices r){
        System.out.println("La forma de una ecuacion de 2do grado es: a(x^2) + b.x + c");
        System.out.println("Ingrese el valor de 'a':");
        r.setA(scan.nextInt());
        System.out.println("Ingrese el valor de 'b':");
        r.setB(scan.nextInt());
        System.out.println("Ingrese el valor de 'c': ");
        r.setC(scan.nextInt());
    }
   public double getDiscriminante(Raices r){
       return (double) Math.pow(r.getB(),2)-4*r.getA()*r.getC();
   }
   public boolean tieneRaices(Raices r){
       return getDiscriminante(r)>=0;
   } 
    public boolean tieneRaiz(Raices r){
       return getDiscriminante(r)==0;
   } 
   public void obtenerRaices(Raices r){
       double x1,x2;
       if(tieneRaices(r)){
           x1 = -r.getB()+ Math.sqrt(getDiscriminante(r))/(2*r.getA());
           System.out.println("Raiz 1: " + x1);
           x2 = -r.getB()- Math.sqrt(getDiscriminante(r))/(2*r.getA());
           System.out.println("Raiz 2: " + x2);           
       }
       else{
           System.out.println("No tiene raices");
       }
   }
   
   public void obtenerRaiz(Raices r){
       if(tieneRaiz(r)){
           System.out.println("La raiz " + (-r.getB()));
       }
       else{
           System.out.println("No tiene raiz");
       } 
    
}
   public void calcular(Raices r){
       if(tieneRaices(r)){
           if(tieneRaiz(r)){
               obtenerRaiz(r);
           }
           else{
               obtenerRaices(r);
           }
       }
       else{
           System.out.println("No tiene raices");
       }
   }
   
}
