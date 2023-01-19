/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author feder
 */
public class Pais implements Comparable<Pais>{
    private String nombre;
    private Integer postal;

    public Pais() {
    }

    public Pais(String nombre, int postal) {
        this.nombre = nombre;
        this.postal = postal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", postal=" + postal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.postal;
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
        final Pais other = (Pais) obj;
        if (this.postal != other.postal) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareTo(t.getNombre());
    }
    

}