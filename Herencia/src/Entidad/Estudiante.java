/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados. 
public class Estudiante extends Persona{
    private ArrayList<String> cursos = new ArrayList<>();

    public Estudiante() {
    } 
  
    public Estudiante(ArrayList<String> cursos, String nombre, String apellido, Long dni, String estCivil) {
        super(nombre, apellido, dni, estCivil);
        this.cursos = cursos;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }
    public void matricular(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nuevo curso:");
        String curso= scan.next();
        if(cursos.contains(curso)){
            System.out.println("Ya esta matriculado en este curso");
        }
        else
            cursos.add(curso);
    }
    @Override
    public String toString() {
        return "Estudiante--> "+nombre+" "+ apellido+", "+ dni +", "+ estCivil +". Cursos matriculado: "+ cursos.toString();
    }
    
    
}
