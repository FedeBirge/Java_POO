/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Armadura;
import entidad.Bota;
import entidad.Casco;
import entidad.Generador;
import entidad.Guante;

/**
 *
 * @author feder
 */
public class serviceArmadura {

    public serviceArmadura() {
        
    }
    
    
// Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine. 
    
    public float caminar(Armadura arm,int temp){
        Generador bat = arm.getBateria();
        Bota bot = arm.getBotaDer();
        float consumida =bot.getConsumo()*bot.usar(1, temp)*2;
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;
    }
//    Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra. 
   public float correr(Armadura arm,int temp){
        Generador bat = arm.getBateria();
        Bota bot = arm.getBotaDer();
        float consumida =bot.getConsumo()*bot.usar(2, temp)*2;
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;
    } 
   
//   Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión. 
   public float propulsar(Armadura arm,int temp){
        Generador bat = arm.getBateria();
        Bota bot = arm.getBotaDer();
        float consumida =bot.getConsumo()*bot.usar(3, temp)*2;
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;
    } 
//   Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes. 
   
   public float volar(Armadura arm, int temp){
       Generador bat = arm.getBateria();
        Bota bot = arm.getBotaDer();
        Guante gua = arm.getGuanteDer();
        float consumida =propulsar(arm, temp)+ gua.getConsumo()*gua.usar(2, temp)*2;
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;
   }
//   • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
   public float disparo(Armadura arm,int temp){
        Generador bat = arm.getBateria();       
        Guante gua = arm.getGuanteDer();
        float consumida =gua.getConsumo()*gua.usar(3, temp);
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;       
   }
//   Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico. 
//   
   public float usoCasco(Armadura arm, int temp){
        Generador bat = arm.getBateria();       
        Casco cas = arm.getCasco();
        float consumida =cas.getConsumo()*cas.usar(1, temp);
        bat.setEstado(bat.getEstado()-consumida);
        arm.setBateria(bat);
        return consumida;   
   }
}
