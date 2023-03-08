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
    
   
    protected abstract float usar(float nivel,int tiempo);

    @Override
    public String toString() {
        return "Dispositivo{" + "consumo=" + consumo + ", roto=" + roto + '}';
    }
    
    
}
