/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Sintetizador extends Dispositivo {

    private Boolean activo;

    public Sintetizador() {
    }

    public Sintetizador(Boolean activo) {
        this.activo = activo;
    }

    public Sintetizador(Boolean activo, Float consumo, Boolean roto) {
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
            res = "Daniado";
        }
        else
        {
             res = "Sana";
        }
        if (activo){
            r = "Activo";
        }
        else
        {
             r = "Apagado";
        }
        
        return  "Estado: " + res+ " "+r;
    }
    
    
}
