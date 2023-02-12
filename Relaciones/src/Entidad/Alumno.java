/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author feder
 */
//nombre completo, DNI y cantidad de votos.
public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Long dni;
    private Integer votos;

    public Alumno() {
        votos=0;
    }

    public Alumno(String nombre, Long dni, Integer votos) {
        this.nombre = nombre;
        this.dni = dni;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.dni);
        hash = 53 * hash + Objects.hashCode(this.votos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.votos, other.votos);
    }

    @Override
    public String toString() {
        return "Alumno "+ nombre+" ["+votos+"]"; //+ " ,dni " + dni + ", cantidad de votos: " + votos;
    }

    @Override
    public int compareTo(Alumno t) {
        return t.getVotos().compareTo(this.votos);
    }
    
    
}
