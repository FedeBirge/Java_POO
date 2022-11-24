/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Cadena;
import Servicio.CadenaService;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService cadServ = new CadenaService();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Cadena cad = cadServ.crearCadena();
        System.out.println("La cantidad de vocales es "+cadServ.mostrarVocales(cad));
        cadServ.invertirFrase(cad);
        System.out.println(cad.getFrase());
        System.out.println("Ingrese una caracter: ");
        String car= scan.next();
        System.out.println("El caracter se repite: "+cadServ.vecesRepetido(cad, car)+" veces");
        System.out.println("Ingrese una frase: ");
        if (cadServ.compararLongitud(cad, scan.next())){
            System.out.println("Tienen la misma longitud ");
        }
        else{
            System.out.println("NO tienen la misma longitud");
            }
        System.out.println("Ingrese una frase: ");
        cadServ.unirFrases(cad, scan.next());
        System.out.println(cad.getFrase());
        cadServ.reemplazar(cad);
       System.out.println(cad.getFrase());
    }
    
}
