/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
public class BarcoMotor extends Barco{
    private Integer potencia;

    public BarcoMotor() {
    }

  

    public BarcoMotor(Integer potencia, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.potencia; 
    }
    
}
