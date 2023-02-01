/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
public class ServicePersona {

    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    public ServicePersona() {
        personas = new ArrayList();
        perros = new ArrayList();
    }

    public void cargarListas() {

        personas.add(new Persona("Juan", "PErez", 21, null, null));
        personas.add(new Persona("Pedro", "Gomez", 45, null, null));
        personas.add(new Persona("Maria", "Suarez", 27, null, null));
        personas.add(new Persona("Susana", "Romero", 44, null, null));

        perros.add(new Perro("chiquito", "calle", 11, "MEDIO"));
        perros.add(new Perro("laica", "rottweiller", 8, "Grande"));
        perros.add(new Perro("simon", "caniche", 2, "CHICO"));
        perros.add(new Perro("CHICHO", "bulldog", 5, "MEDIO"));
        perros.add(new Perro("pepa", "ovejero", 4, "GRANDE"));
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);

        }

    }

    public void adoptar() {
        Scanner scan = new Scanner(System.in);
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", ingrese el nombre del perro que quiere adoptar");
            String nombre = scan.next();
            boolean existe = false;
            for (Perro p : perros) {
                if (p.getNombre().equals(nombre)) {
                    System.out.println(p.getNombre() + " PERRO ADOPTADO");
                    persona.setPerro(p);
                    perros.remove(p);
                    existe = true;
                    break;
                }
                
            }
            if (!existe) {
                System.out.println("El perro fue adoptado o no existe en la lista");
                System.out.println("");
            }

        }

    }

}
