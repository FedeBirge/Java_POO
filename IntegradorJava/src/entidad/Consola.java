/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Consola extends Dispositivo {
    private Boolean activo;

    public Consola() {
    }

    public Consola(Boolean activo) {
        this.activo = activo;
    }

    public Consola(Boolean activo, Float consumo, Boolean roto) {
        super(consumo, roto);
        this.activo = activo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
         String res="";
         String r="";
        if (roto){
            res = "Daniada";
        }
        else
        {
             res = "Sana";
        }
        if (activo){
            r = "Activa";
        }
        else
        {
             r = "Apagada";
        }
        
        return  "Estado: " + res+ " "+r;
    }
    
    
    

    
    
    
}
