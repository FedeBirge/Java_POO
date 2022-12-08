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
//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. 
//Definir dos constructores: unconstructor vacío y otro con la hora, 
//minutos y segundos ingresado por el usuario. Deberá definir además, 
//los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y 
//segundos ingresados por el usuario. Te animas a simular el paso del tiempo en consola??????

public class Tiempo {
    private int hs;
    private int min;
    private int seg;

    public Tiempo() {
    }

    public Tiempo(int hs, int min, int seg) {
        this.hs = hs;
        this.min = min;
        this.seg = seg;
    }

    public int getHs() {
        return hs;
    }


    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    @Override
    public String toString() {
        return "Tiempo: " + hs + " : " + min + " : " + seg ;
    }
    
}
