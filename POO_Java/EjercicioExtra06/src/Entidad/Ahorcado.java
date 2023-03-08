/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author feder
 */
//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
//con los parámetros que sean necesarios:
// Constructores, tanto el vacío como el parametrizado.
public class Ahorcado {
    private String[] palabra;
    private int encontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int jugadasMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", encontradas=" + encontradas + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
}
