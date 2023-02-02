/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
public class Asiento {
    private String nombre;
    private Boolean ocuado;

    public Asiento() {
        ocuado=false;
    }

    public Asiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getOcuado() {
        return ocuado;
    }

    public void setOcuado(Boolean ocuado) {
        this.ocuado = ocuado;
    }

   
    @Override
    public String toString() {
        return nombre;
    }

       
    
}
