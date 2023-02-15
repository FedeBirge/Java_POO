/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
public abstract class Animal {
    protected String nombre;
    protected String alimneto;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimneto, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimneto = alimneto;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimneto() {
        return alimneto;
    }

    public void setAlimneto(String alimneto) {
        this.alimneto = alimneto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimneto=" + alimneto + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
}
