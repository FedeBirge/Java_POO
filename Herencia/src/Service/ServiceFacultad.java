/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceFacultad {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> personas = new ArrayList<>();

    public ServiceFacultad() {

        Estudiante e = new Estudiante(new ArrayList(Arrays.asList("Matematica", "Fisica")), "Fede", "Lopez", 1234L, "Soltero");
        personas.add(e);
        Profesor p = new Profesor("Ingenieria", LocalDate.now(), 10, "Juan", "Perez", 4321L, "Soltero");
        personas.add(p);
        PersonalServicio per = new PersonalServicio("Limpieza", LocalDate.MIN, 7, "Jose", "Lopez",3333L, "CASADO");
        personas.add(per);
    }

    private Persona buscarPersona() {
        System.out.println("Ingrese el DNI de la persona:");
        long dni = scan.nextLong();
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                return persona;
            }
        }
        return null;
    }
    private Empleado buscarEmpleado(){
        System.out.println("Ingrese el DNI de la persona:");
        long dni = scan.nextLong();
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Empleado) {
                    Empleado e = (Empleado) persona;
                    return e;
                }
                
            }
        }
        return null;
        
    }
    private Estudiante buscarEstudiante(){
        System.out.println("Ingrese el DNI de la persona:");
        long dni = scan.nextLong();
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Estudiante) {
                    Estudiante e = (Estudiante) persona;
                    return e;
                }
                
            }
        }
        return null;
    }
    private Profesor buscarProfesor(){
        System.out.println("Ingrese el DNI de la persona:");
        long dni = scan.nextLong();
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof Profesor) {
                    Profesor e = (Profesor) persona;
                    return e;
                }
                
            }
        }
        return null;
    }
    private PersonalServicio buscarPersonal(){
        System.out.println("Ingrese el DNI de la persona:");
        long dni = scan.nextLong();
        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                if (persona instanceof PersonalServicio) {
                    PersonalServicio e = (PersonalServicio) persona;
                    return e;
                }
                
            }
        }
        return null;
    }

    private void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    private void mostrarPersonas() {
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante e = (Estudiante) persona;
                System.out.println(e);
                continue;
            }
            if (persona instanceof Profesor) {
                Profesor p = (Profesor) persona;
                System.out.println(p);
                continue;
            }
            if (persona instanceof PersonalServicio) {
                PersonalServicio s = (PersonalServicio) persona;
                System.out.println(s);
                continue;
            }
            

        }
    }

    public void menu() {
        System.out.println("*------------ Gestion Inegral Facultad ------------*");
        System.out.println("");
        System.out.println("1. Cambio del estado civil de una persona");
        System.out.println("2. Reasignación de despacho a un empleado");
        System.out.println("3. Matriculación de un estudiante en un nuevo curso");
        System.out.println("4. Cambio de departamento de un profesor");
        System.out.println("5. Traslado de sección de un empleado del personal de servicio");
        System.out.println("6. Imprimir toda la información de cada tipo de individuo");
        System.out.println("7. Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion: ");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                Persona p = buscarPersona();
                if (p == null) {
                    System.out.println("La persona no existe");

                } else {
                    p.cambiarEstado();
                }
                presioneTecla();
                menu();
                break;
            case 2:
                Empleado p2 = buscarEmpleado();
                if (p2 == null) {
                    System.out.println("El empleado no existe");

                } else {
                    p2.cambiarDespacho();
                    
                }
                
                presioneTecla();
                menu();
                break;
            case 3:
                Estudiante e = buscarEstudiante();
                if (e == null) {
                    System.out.println("El estudiante no existe");

                } else {
                    e.matricular();
                    
                }
                
                presioneTecla();
                menu();
                break;
            case 4:
                 Profesor pro = buscarProfesor();
                if (pro == null) {
                    System.out.println("El profe no existe");

                } else {
                    System.out.println("Ingrese en nuevo dpto: ");                   
                    pro.setDpto(scan.next());
                    
                }
                presioneTecla();
                menu();
                break;
            case 5:
                PersonalServicio per = buscarPersonal();
                if (per == null) {
                    System.out.println("El profe no existe");

                } else {
                    System.out.println("Ingrese la nueva seccion: ");                   
                    per.setSeccion(scan.next());
                    }
                presioneTecla();
                menu();
                break;
            case 6:
                mostrarPersonas();
                presioneTecla();
                menu();
                break;
            case 7:
                presioneTecla();
                
                break;
            default:
                System.out.println("Opcion incorrecta!!!");
                presioneTecla();
                menu();
                break;
        }

    }

}
