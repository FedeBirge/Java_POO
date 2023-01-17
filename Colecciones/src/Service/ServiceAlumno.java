/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
//pregunta al usuario si quiere crear otro Alumno o no.

//Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
//promedio final, devuelto por el método y mostrado en el main.
public class ServiceAlumno {
    private ArrayList<Alumno> ListaAlumnos;
    private Scanner scan = new Scanner(System.in);
    public ServiceAlumno() {
        this.ListaAlumnos = new ArrayList();
    }
    public float notaFinal(){
        float prom=0;
        
        System.out.println("Ingrese el nombre de un alumno para calcular su nota final:");
        String nombre = scan.next();
        Integer[] notas =new Integer[3];
        for (Alumno alum : ListaAlumnos) {
            if(alum.getNombre().equals(nombre)){
                notas = alum.getNotas();
            
                for (int i = 0; i <3 ; i++) {
                    prom+=notas[i];
                    
                
                }
            break;
        } 
        }
        return (prom/3);
        
    
    }
    
    public void CargarAlumnos(){
        
        
        System.out.println("-------Se solicitan nombre y notas de alumnos-------");
         do {
             Alumno alu = new Alumno();
             System.out.println("Ingrese el nombre del alumno:");
             alu.setNombre(scan.next());
             Integer[] nota = new Integer[3];
             for (int i = 0; i < 3 ; i++) {
                 System.out.println("Ingrese la nota "+(i+1));
                 nota[i]=scan.nextInt();
                 
             }
             alu.setNotas(nota);
            ListaAlumnos.add(alu);
            System.out.println("Desea ingresar otro alumno? (S/N)");
            String res = scan.next();
            if (res.equals("N")) {
                break;
            }
        } while (true);
    }
    public void MostrarAlumnos(){
        for (Alumno alum : ListaAlumnos) {
            System.out.println(alum);
            
        }
    }
    
}
