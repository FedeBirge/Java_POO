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
//    Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
//almacenar cada producto con su información. Crear una entidad Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
//un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
//correspondiente al código. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
public class Movil {
    private String marca;
    private float precio;
    private String modelo;
    private int memoriaRam;
    private int almacen;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, float precio, String modelo, int memoriaRam, int almacen, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacen = almacen;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacen=" + almacen + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
    

    
}
