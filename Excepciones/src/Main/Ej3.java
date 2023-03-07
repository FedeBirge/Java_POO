/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
//    3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado. 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        try{
            String a1 = "55";
            String b1 = "10";
            DivisionNumero div = new DivisionNumero();
            div.setA(Integer.parseInt(a1));
            div.setB(Integer.parseInt(b1));
            System.out.println("Division: " +(div.getA()/div.getB()));
            
        }catch(Exception e){
            System.out.println(e);}
        
    }
    
}
