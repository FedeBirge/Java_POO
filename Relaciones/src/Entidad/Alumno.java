/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//nombre completo, DNI y cantidad de votos.
public class Alumno {
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
    public String toString() {
        return "Alumno "+ nombre+" ["+votos+"]"; //+ " ,dni " + dni + ", cantidad de votos: " + votos;
    }
    
    
}
