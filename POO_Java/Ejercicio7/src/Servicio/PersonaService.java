/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
//Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
//función devuelve un 1. 
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
//un booleano.
public class PersonaService {

    public Persona crearPersona() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Persona per = new Persona();
        System.out.println("Imgrese el nombre de la persona:");
        per.setNombre(scan.next());
        System.out.println("Ingrese la edad: ");
        per.setEdad(scan.nextInt());
        while (true) {
            System.out.println("Ingrese el sexo. Opciones H para hombre, M para mujer, O para otros");
            String sex = scan.next();
            if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")) {
                per.setSexo(sex);
                break;
            } else {
                System.out.println("Error! al elegir opcion");
            }
        }
        System.out.println("Ingrese el peso de la persona: ");
        per.setPeso(scan.nextFloat());
        System.out.println("Ingrese la altura de la persona: ");
        per.setAltura(scan.nextFloat());
        return per;
    }
 public int calcularIMC(Persona per){
     float imc=per.getPeso()/(per.getAltura()*per.getAltura());
     if (imc < 20){
         return -1;
     }
     else if (imc>=20 && imc<=25){
         return 0;
              }
     else {
         return 1;
     }
         
 }
 public boolean esMayorDeEdad(Persona per){
        return per.getEdad()>17;
 }

}
