/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Matematica;
import Servicio.MatematicaService;

/**
 *
 * @author feder
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica num = new Matematica();
        MatematicaService matServ = new MatematicaService();
        matServ.crearNumeros(num);
        System.out.println(num);
        System.out.println("El mayor es: "+matServ.devolverMayor(num));
        System.out.println("La potencia del mayor elevado al menor es: "+matServ.calcularPotencia(num));
        System.out.println("La raiz cuadrada del menor es: "+matServ.calcularRaiz(num));
        
    }
    
}
