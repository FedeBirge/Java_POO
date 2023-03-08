/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class OperacionService {
  
public Operacion crearOperacion(){
    Scanner scan = new Scanner(System.in);
    Operacion op = new Operacion();
    System.out.println("Ingrese un numero: ");
    op.setNum1(scan.nextFloat());
    System.out.println("Ingrese otr numero: ");
    op.setNum2(scan.nextFloat());
    return op;
    
}
public float suma(Operacion op){
    return op.getNum1() + op.getNum2();
}
public float resta(Operacion op){
    return op.getNum1() - op.getNum2();
}
public float multi (Operacion op){
    if(op.getNum1()==0 || op.getNum2()==0){
        System.out.println("ERROR: multiplicando por cero.");
        return 0;
    }
    else{
        return op.getNum1()*op.getNum2();
    }
}
public float division(Operacion op){
    if(op.getNum1()==0 || op.getNum2()==0){
        System.out.println("ERROR: division por cero.");
        return 0;
    }
    else{
        return (op.getNum1()/op.getNum2());
    }
}
    
}
