/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Guante extends Dispositivo{
    private Boolean repu;
    private Boolean arma;

    public Guante() {
    }  

    public Guante(Boolean repu, Boolean arma, Float consumo, Boolean roto) {
        super(consumo, roto);
        this.repu = repu;
        this.arma = arma;
    }

    public Boolean getRepu() {
        return repu;
    }

    public void setRepu(Boolean repu) {
        this.repu = repu;
    }

    public Boolean getArma() {
        return arma;
    }

    public void setArma(Boolean arma) {
        this.arma = arma;
    }
    
    @Override
    public String toString() {
             String res="";
         String r="";
         String g="";
        if (roto){
            res = "Daniado";
        }
        else
        {
             res = "Sano";
        }
        if (repu){
            r = "Activo";
        }
        else
        {
             r = "Apagado";
        }
        if (arma){
            g = "Activa";
        }
        else
        {
             g = "Apagada";
        }
        
        return "Estado: " + res+", Propulsor: "+r+ ", Arma: "+g;
    }
    
    
    
}
