/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Animal;

/**
 *
 * @author feder
 */
public class ServiceCaballo extends ServiceAnimal{

    @Override
    public void alimentarse(Animal a) {
        System.out.println("El caballo se alimenta de: "+a.getAlimneto());
        System.out.println("");
            }
    
}
