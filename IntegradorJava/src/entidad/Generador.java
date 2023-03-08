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
    private Float cargaActual;
    private Float cargaMax;

    public Generador() {
        cargaMax = Float.MAX_VALUE;
    }

    public Generador(Float cargaActual, Float cargaMax) {
        this.cargaActual = cargaActual;
        this.cargaMax = cargaMax;
    }

    public Float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(Float cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(Float cargaMax) {
        this.cargaMax = cargaMax;
    }

    

    @Override
    public String toString() {
        return " Nivel de carga: " + cargaActual ;
    }
    
    
}
