/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author feder
 */
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
public class ServiceCurso {

    Scanner scan = new Scanner(System.in);

    public void cargarAlumnos(Curso cur) {
        String[] alum = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alum[i] = scan.next();

        }
        cur.setAlumno(alum);

    }

    public void crearCurso(Curso cur) {
        System.out.println("Ingrese el nombre del curso: ");
        cur.setNombreCurso(scan.next());
        System.out.println("Cantidad de horas por dia del curso:");
        cur.setCantidadHorasPorDia(scan.nextFloat());
        System.out.println("Cantidad de dias por semana: ");
        cur.setCantidadDiasPorSemana(scan.nextInt());
        while (true) {
            System.out.println("Ingrese turno del curso | 't para Tarde y 'm' para mañana");
            String aux = scan.next();
            if (aux.equalsIgnoreCase("t")) {
                cur.setTurno(true);
                break;
            } else {
                if (aux.equalsIgnoreCase("m")) {
                    cur.setTurno(false);
                    break;
                }
            }
        }
        System.out.println("Ingrese valor precio por hora:");
        cur.setPrecioPorHora(scan.nextFloat());
        System.out.println("*** Alumnos del curso ***");
        cargarAlumnos(cur);
    }
    public float calcularGananciaSemanal(Curso cur){
        return (5*cur.getPrecioPorHora()*cur.getCantidadDiasPorSemana()*cur.getCantidadHorasPorDia());
    }

}
