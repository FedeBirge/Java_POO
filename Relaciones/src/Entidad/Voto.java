/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author feder
 */
//Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
//un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
public class Voto {
    
    private Alumno alumno;
    private ArrayList<Alumno> votados;

    public Voto() {
        votados = new ArrayList<>();
    }

    public Voto(Alumno alumno, ArrayList<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto de "+ alumno + ". Votados" + votados ;
    }
    
    
}
