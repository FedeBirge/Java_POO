/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
public class Velero extends Barco{
    private Integer mastiles;

    public Velero() {
    }

      public Velero(Integer mastiles, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.mastiles; 
    }
    
}
