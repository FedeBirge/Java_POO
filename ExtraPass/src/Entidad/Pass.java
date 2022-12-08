/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author feder
 */
//Crear una clase Pass, donde declaremos los siguientes atributos:
//● pass : Del tipo String
//● nombre: Del tipo String
//● dni: Del tipo int.
//Métodos para desarrollar:
//● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
//teclado)
public class Pass {
    private String pass;
    private String nombre;
    private int dni;

    public Pass() {
        this.pass = "pazsworda";
        this.nombre = "Juancito";
        this.dni = 15487454;
    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = "password";
        this.nombre = "Juancito";
        this.dni = 15487454;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
