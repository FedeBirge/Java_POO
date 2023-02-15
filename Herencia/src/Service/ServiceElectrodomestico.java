/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Electrodomestico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public abstract class ServiceElectrodomestico {
//     Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
//objeto y no será visible.

    private void comprobarConsumo(Electrodomestico e) {
        if (e.getConsumo() < 'A' || e.getConsumo() > 'F') {
            e.setConsumo('F');
        }
    }
//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
//minúsculas. Este método se invocará al crear el objeto y no será visible.
//13

    private void comprobarColor(Electrodomestico e) {
        ArrayList<String> colores = new ArrayList(Arrays.asList("blanco", "negro,", "rojo", "azul", "gris"));
        if (!colores.contains(e.getColor())) {
            e.setColor("blanco");
        }
    }

// Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
//precio
    protected void preciofinal(Electrodomestico e) {
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio() + 1000f);
                break;
            case 'B':
                e.setPrecio(e.getPrecio() + 800f);
                break;
            case 'C':
                e.setPrecio(e.getPrecio() + 600f);
                break;
            case 'D':
                e.setPrecio(e.getPrecio() + 500f);
                break;
            case 'E':
                e.setPrecio(e.getPrecio() + 300f);
                break;
            case 'F':
                e.setPrecio(e.getPrecio() + 100f);
                break;
            default:
                break;
        }
        if (e.getPeso() < 20) {
            e.setPrecio(e.getPrecio() + 100f);

        } else {
            if (e.getPeso() < 50) {
                e.setPrecio(e.getPrecio() + 500f);
            } else {
                if (e.getPeso() < 80) {
                    e.setPrecio(e.getPrecio() + 800f);
                } else {
                    e.setPrecio(e.getPrecio() + 1000f);
                }
            }
        }
    }
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
//precio se le da un valor base de $1000.
//    

    protected void crearElectrodomestico(Electrodomestico e) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        e.setPrecio(1000f);
        System.out.println("Ingrese el color: ");
        e.setColor(scan.next().toLowerCase());
        System.out.println("Ingrese el tipo de consumo electrico(A a la F): ");
        e.setConsumo(scan.next().toUpperCase().charAt(0));
        System.out.println("Ingrese el peso: ");
        e.setPeso(scan.nextFloat());
        comprobarColor(e);
        comprobarConsumo(e);
    }

}
