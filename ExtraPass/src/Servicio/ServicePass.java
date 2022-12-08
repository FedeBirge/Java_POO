/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
//validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
//Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
//● Crear un método para analizar la contraseña(analizarPass). Donde:
//o SI Existe al menos una letra z : Es nivel MEDIO
//o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
//o Si ninguna condición se cumple es nivel BAJO
//● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
//debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
//acceso a modificar los datos.
public class ServicePass {

    Scanner scan = new Scanner(System.in);

    private String crearPass() {
        String aux = "";
        do {
            System.out.println("Ingrese una contraseña de 10 caracteres:");
            aux = scan.next();

        } while (aux.length() != 10);
        return aux;
    }

    private boolean cantA(String pass) {
        int cant = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.substring(i, i + 1).equalsIgnoreCase("a")) {
                cant++;
            }

        }
        return cant > 1;

    }

    private void analizarPass(String pass) {
        CharSequence s="z";
        if (pass.contains(s)) {
            if (cantA(pass)) {
                System.out.println("ALTO");
            } else {
                System.out.println("MEDIO");
            }
        } else {
            System.out.println("BAJO");
        }
    }

    private void modificarNombre(Pass p) {
        do {
            System.out.println("Ingrese contraseña para modificar su nombre:");
            if (p.getPass().equals(scan.next())) {
                System.out.println("Contraseñana correcta!");
                System.out.println("Ingrese su nombre: ");
                p.setNombre(scan.next());
                break;
            } else {
                System.out.println("Contraseña incorrecta!");
            }
        } while (true);
    }

    private void modificarDni(Pass p) {
        do {
            System.out.println("Ingrese contraseña para modificar su DNI:");
            if (p.getPass().equals(scan.next())) {
                System.out.println("Contraseñana correcta!");
                System.out.println("Ingrese su DNI: ");
                p.setDni(scan.nextInt());
                break;
            } else {
                System.out.println("Contraseña incorrecta!");
            }
        } while (true);
    }

    //● A través de un menú de opciones:
//o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
//contraseña valida).
//o B) Mensaje al usuario que tipo de NIVEL es su contraseña
//o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
//dar permiso
//o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
//SINO impedir cambios
//o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
//SINO impedir cambios
    public void menu() {
        Pass p = new Pass();
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese una opcion (A, B, C , D, E)");
            switch (scan.next()) {
                case "A":
                    p.setPass(crearPass());
                    break;
                case "B":
                    analizarPass(p.getPass());
                    break;
                case "C":
                    modificarNombre(p);
                    break;
                case "D":
                    modificarDni(p);
                    break;
                case "E":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
        }
    }
}
