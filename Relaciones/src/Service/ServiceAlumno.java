/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author feder
 */
public class ServiceAlumno {
        public static Comparator<Alumno> compararCantVotosDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno p1, Alumno p2) {
            return p2.getVotos().compareTo(p1.getVotos());
        }
    };
    
}
