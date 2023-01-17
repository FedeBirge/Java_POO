/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
//salir, se mostrará todos los perros guardados en el ArrayList.
public class ejer1Serv {
    
    public void MostarPerros(ArrayList<String> perros){
        for (String perro : perros) {
            System.out.println(perro);
            
        }
    }
    public void BuscarRaza(ArrayList<String> perros,String raza){
     Iterator itera = perros.iterator();
          if (perros.contains(raza)){
             System.out.println("La raza fue removida de la lista");
        }
        else{
             System.out.println("La raza no existe en la lista");
        }
        while(itera.hasNext()){
            if (itera.next().equals(raza)){
                itera.remove();
               
               
            }
        }
      
}
    public void CargarRazas(ArrayList<String> perros){
       Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese una raza de perro: ");
            perros.add(scan.next());
            System.out.println("Desea ingresar otra raza? (S/N)");
            String res = scan.next();
            if (res.equals("N")) {
                break;
            }
        } while (true);
    }
        
               
}
