/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public abstract class Dispositivo {
    protected Float consumo;
    protected Boolean roto;

    public Dispositivo() {
    }

    public Dispositivo(Float consumo, Boolean roto) {
        this.consumo = consumo;
        this.roto = roto;
    }

    public Float getConsumo() {
        return consumo;
    }

    public void setConsumo(Float consumo) {
        this.consumo = consumo;
    }

    public Boolean getRoto() {
        return roto;
    }

    public void setRoto(Boolean roto) {
        this.roto = roto;
    }
    
   
    public float usar(float nivel,int tiempo){
        return nivel*tiempo;
    }
    public boolean seRompe(){
        int prob = (int) (Math.random()*10);
        if (prob<=3) {
            System.out.println("rompe "+prob);
            
            return true;
            
        } else {

            return false;
        }
    }
    public boolean reparar(){
        int prob = (int) (Math.random()*10);
        
        if (prob>4) {
            setRoto(Boolean.TRUE);
            return false;
            
        } else {
            System.out.println("repara "+prob);
            setRoto(Boolean.FALSE);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "consumo=" + consumo + ", roto=" + roto + '}';
    }
    
    
}
