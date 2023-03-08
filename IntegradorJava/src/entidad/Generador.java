/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Generador {
    private Float estado;

    public Generador() {
        estado = Float.MAX_VALUE;
    }

    public Generador(Float estado) {
        this.estado = estado;
    }

    public Float getEstado() {
        return estado;
    }

    public void setEstado(Float estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return " Nivel de carga: " + estado  ;
    }
    
    
}
