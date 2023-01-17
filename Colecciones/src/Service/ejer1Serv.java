/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Collections;
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

    private ArrayList<String> ListaPerros;
    private Scanner scan = new Scanner(System.in);

    public ejer1Serv() {
        this.ListaPerros = new ArrayList();
    }

    public void MostarPerros() {
        for (String perro : ListaPerros) {
            System.out.println(perro);

        }
    }

    public void BuscarRaza() {
        Iterator itera = ListaPerros.iterator();
        System.out.println("");
        System.out.println("Ingrese una raza a buscar,si se encuentra en la lista será eliminada ");
        String raza = scan.next();
        if (ListaPerros.contains(raza)) {
            System.out.println("La raza fue removida de la lista");
        } else {
            System.out.println("La raza no existe en la lista");
        }
        while (itera.hasNext()) {
            if (itera.next().equals(raza)) {
                itera.remove();

            }
        }

    }

    public void CargarRazas() {

        do {
            System.out.println("Ingrese una raza de perro: ");
            ListaPerros.add(scan.next());
            System.out.println("Desea ingresar otra raza? (S/N)");
            String res = scan.next();
            if (res.equals("N")) {
                break;
            }
        } while (true);
    }

    public void OrdenarPerros() {
        Collections.sort(ListaPerros);
    }

}
