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
        return "Tiempo: " + hs + " : " + min + " : " + seg + '.';
    }
    
}
