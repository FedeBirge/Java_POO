/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
public class Bota extends Dispositivo{
    private Boolean propu;

    public Bota() {
    }

    public Bota(Boolean propu) {
        this.propu = propu;
    }

    public Bota(Boolean propu, Float consumo, Boolean roto) {
        super(consumo, roto);
        this.propu = propu;
    }

    public Boolean getPropu() {
        return propu;
    }

    public void setPropu(Boolean propu) {
        this.propu = propu;
    }  
   @Override
    public float usar(float nivel, int tiempo) {
        return nivel*tiempo;
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
             res = "Sano";
        }
        if (propu){
            r = "Activo";
        }
        else
        {
             r = "Apagado";
        }
        
        return  "Estado: " + res+", Propulsor: "+r;
    }

    
    
    
}
