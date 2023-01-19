/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Compa;
import Entidad.Pais;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author feder
 */
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
//al usuario
public class ServicePais {

    private Set<Pais> paises;
    private Scanner scan;

    public ServicePais() {
        this.paises = new TreeSet();
        this.scan = new Scanner(System.in);
    }

    public void cargarPaises() {

        System.out.println(" - - - - - - - Ingreso de paises - - - - - - - ");
        System.out.println("");

        do {
            Pais p = new Pais();
            System.out.println("Ingrese el nombre de un pais:");
            p.setNombre(scan.next());
            System.out.println("Ingrese el codigo postal:");
            p.setPostal(scan.nextInt());
            paises.add(p);
            System.out.println("Desea ingresar otro pais? (S/N)");
            String res = scan.next();
            if (res.equals("N")) {
                break;
            }

        } while (true);

    }

    public void mostrarPaises() {
        for (Pais p : paises) {
            System.out.println(p);
        }
    }

    //Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
//al usuario
    public void buscarPais() {
        System.out.println("Ingrese el nombre de un pais a buscar ");
        String pais = scan.next();
        Iterator<Pais> it = paises.iterator();
        int cant = paises.size();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
            }
        }
        if (cant != paises.size()) {
            mostrarPaises();
        } else {
            System.out.println("El pais ingresado no está en el conjunto");
        }
    }

}
