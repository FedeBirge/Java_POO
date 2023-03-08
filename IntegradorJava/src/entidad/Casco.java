/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Casco extends Dispositivo{
    
   private Boolean consola;
   private Boolean sinte;

    public Casco() {
    }  

    public Casco(Boolean consola, Boolean sinte, Float consumo, Boolean roto) {
        super(consumo, roto);
        this.consola = consola;
        this.sinte = sinte;
    }

    public Boolean getConsola() {
        return consola;
    }

    public void setConsola(Boolean consola) {
        this.consola = consola;
    }

    public Boolean getSinte() {
        return sinte;
    }

    public void setSinte(Boolean sinte) {
        this.sinte = sinte;
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
        if (consola){
            r = "Activa";
        }
        else
        {
             r = "Apagada";
        }
        if (sinte){
            g = "Activo";
        }
        else
        {
             g = "Apagado";
        }
        
        return "Estado: " + res+", Consola: "+r+", Sintetizador: "+g;
    }

    @Override
    public float usar(float nivel, int tiempo) {
        return nivel*tiempo;
    }
    
   
    
    
}
