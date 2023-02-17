/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author feder
 */
public class Yate extends Barco{
    private Integer potencia;
    private Integer camarotes;

    public Yate() {
    }

  
    public Yate(Integer potencia, Integer camarotes, String matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    @Override
    public Integer calcularModulo(){
        return super.calcularModulo()+ this.camarotes+this.potencia; 
    }
}
