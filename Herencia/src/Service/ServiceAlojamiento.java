/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author feder
 */
public class ServiceAlojamiento {

    private ArrayList<Alojamiento> lista;
Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public ServiceAlojamiento() {
        lista = new ArrayList<>();        
        Hotel4 a = new Hotel4("A", "La cocinita", 50, 120, 210, 4, 0, "Yeraton", "La Rioja 16", "Carlos Paz", "Guido Suller");
        a.calcularPrecio();
        lista.add(a);
        Hotel4 a1 = new Hotel4("B", "La cueva vegana", 50, 80, 100, 3, 0, "Colonial", "Mexico 455", "Cordoba", "Susano Gimenez");
        a1.calcularPrecio();
        lista.add(a1);
        Hotel5 a2 = new Hotel5(3, 10, 10, "A", "El fideo de carne", 28, 68, 80, 2, 0, "Las pajaritas", "Jujuy 154", "Villa Allende", "Juan Perez");
        a2.calcularPrecio();
        lista.add(a2);
        Hotel5 a3 = new Hotel5(2, 13, 23, "A", "El parrillita loca", 50, 88, 150, 3, 0, "Big Hotel", "Colon 3454", "Alta Gracia", "Juan Perez");
        a3.calcularPrecio();
        lista.add(a3);
        Camping c = new Camping(15, 5, Boolean.TRUE, Boolean.TRUE, 500, 100, "El arroyo", "Salta 4343", "Mendoza", "Silvia");
        lista.add(c);
        Residencia r = new Residencia(5, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, 45, 200, "CAsita", "Corrientes 13", "Arroyito", "nadie");
        lista.add(r);
    }

    public void mostrarTodos() {
        for (Alojamiento alojamiento : lista) {
            System.out.println(alojamiento);
            System.out.println("");
        }
    }

    public void mostrarHotelesOrd() {
        TreeSet<Hotel> hoteles = new TreeSet();
        for (Alojamiento alojamiento : lista) {

            if (alojamiento instanceof Hotel) {
                Hotel h = (Hotel) alojamiento;
                hoteles.add(h);
                
            }
        }
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
                System.out.println("");
        }
    }

    public void mostrarCampingResto() {
        for (Alojamiento alojamiento : lista) {

            if (alojamiento instanceof Camping) {
                Camping c = (Camping) alojamiento;
                if (c.getResto()) {
                    System.out.println(c);
                    System.out.println("");
                }
            }

        }
    }
    public void mostrarResidenciaDesc() {
        for (Alojamiento alojamiento : lista) {

            if (alojamiento instanceof Residencia) {
                Residencia c = (Residencia) alojamiento;
                if (c.getDescuento()) {
                    System.out.println(c);
                    System.out.println("");
                }
            }

        }
    }
public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }
    public void menu() {
        
        System.out.println("1. todos los alojamientos");
        System.out.println("2. todos los hoteles de más caro a más barato");
        System.out.println("3. todos los campings con restaurante");
        System.out.println("4. todos las residencias que tienen descuento");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion: ");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                mostrarTodos();
                presioneTecla();
                menu();
                break;
            case 2:
                mostrarHotelesOrd();
                presioneTecla();
                menu();
                break;
            case 3:
                mostrarCampingResto();
                presioneTecla();
                menu();
                break;
            case 4:
                mostrarResidenciaDesc();
                presioneTecla();
                menu();
                break;
            case 5:
                break;

            default:
                System.out.println("OPcion incorrecta!!");
                presioneTecla();
                menu();
        }
    }

}
