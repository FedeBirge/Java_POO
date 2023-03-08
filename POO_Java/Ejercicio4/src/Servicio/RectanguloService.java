/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author feder
 */
//. La clase incluirá un método para crear el rectángulo con 
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
//altura. Se deberán además definir los métodos getters, setters y constructores 
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2
public class RectanguloService {
    
    public Rectangulo crearRectangulo(){
        Scanner scan = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la base de un rectangulo");
        rec.setBase(scan.nextInt());
        System.out.println("Ingrese la altura de un rectangulo");
        rec.setAltura(scan.nextInt());
        return rec;
    }
    
    public int superficie(Rectangulo rec){
        return rec.getAltura()*rec.getBase();
    }
    
    public int perimetro(Rectangulo rec){
        return (rec.getAltura()+rec.getBase())*2;
    }
    public void dibujarRectangulo(Rectangulo rec){
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if (i==0 || i==rec.getAltura()-1 || j==0 || j== rec.getBase()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println("");
        }
    }
}
