/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceCircunferencia {
    
    public Circunferencia crearCircunferencia(){
        Scanner scan = new Scanner(System.in);
        Circunferencia cir = new Circunferencia();
        System.out.println("Ingrese el radio para un circunferencia: ");
        cir.setRadio(scan.nextFloat());
        return cir;
    }
    
    public float area(Circunferencia cir){
        
        return ((float)Math.PI*((float) Math.pow(cir.getRadio(),2)));
       
    }
    public float perimetro(Circunferencia cir){
        return (float) (Math.PI*cir.getRadio()*2);
    }  
    
}
