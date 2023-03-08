/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Operacion;
import Servicio.OperacionService;

/**
 *
 * @author feder
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    OperacionService ops = new OperacionService();
    Operacion op= ops.crearOperacion();
        System.out.println(op);
        System.out.println("la suma es: "+ops.suma(op));  
        System.out.println("la resta es: "+ops.resta(op)); 
        System.out.println("la multiplicacion es: "+ops.multi(op)); 
        System.out.println("la division es: "+ops.division(op)); 
    }
    
}
