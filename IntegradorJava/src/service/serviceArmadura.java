/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Armadura;
import entidad.Bota;
import entidad.Consola;
import entidad.Generador;
import entidad.Guante;
import entidad.Sintetizador;

/**
 *
 * @author feder
 */
public class serviceArmadura {

    public serviceArmadura() throws Exception {
        Armadura ar = new Armadura("Rojo", "Gris", "res",
                new Bota(Boolean.TRUE, 50F, Boolean.FALSE), new Bota(Boolean.TRUE, 50F, Boolean.FALSE),
                new Guante(Boolean.TRUE, Boolean.TRUE, 100F, Boolean.FALSE),
                new Guante(Boolean.TRUE, Boolean.TRUE, 100F, Boolean.FALSE),
                new Consola(Boolean.TRUE, 30F, Boolean.FALSE),
                new Sintetizador(Boolean.TRUE, 40F, Boolean.FALSE),
                100, new Generador(1000000F, 1000000F));
        System.out.println(ar);
        System.out.println(ar.getBateria());
        System.out.println("Bateria en porcentaje: " + estadoBateria(ar) + "%");
        System.out.println(caminar(ar, 50));
                System.out.println(ar.getBotaDer()+" "+ar.getBotaIzq()+" "+ar.getGuanteDer()+" "+ar.getGuanteIzq());
        System.out.println(volar(ar, 300));  
        System.out.println(ar.getBotaDer()+" "+ar.getBotaIzq()+" "+ar.getGuanteDer()+" "+ar.getGuanteIzq());
        System.out.println(caminar(ar, 150));
                System.out.println(ar.getBotaDer()+" "+ar.getBotaIzq()+" "+ar.getGuanteDer()+" "+ar.getGuanteIzq());
        System.out.println(ar.getBateria());
        System.out.println("Bateria en porcentaje: " + estadoBateria(ar) + "%");

    }

// Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine. 
    public float caminar(Armadura arm, int temp) throws Exception {
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Bota bot = arm.getBotaDer();
            Bota bot1 = arm.getBotaIzq();
             if (bot.getRoto() && !bot.reparar()) {
                throw new Exception( "BOTA DER ROTA - NO PUEDE CAMINAR");                
            }
             if (bot1.getRoto()&& !bot1.reparar()) {
                throw new Exception( "BOTA IZQ ROTA - NO PUEDE CAMINAR");                
            }

            consumida = bot.getConsumo() * (bot.usar(1, temp) + bot1.usar(1, temp));
            bot.setRoto(bot.seRompe());
             bot1.setRoto(bot1.seRompe());
            bat.setCargaActual(bat.getCargaActual() - consumida);
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }
//    Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra. 

    public float correr(Armadura arm, int temp) throws Exception{
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Bota bot = arm.getBotaDer();
            Bota bot1 = arm.getBotaIzq();
              if (bot.getRoto()&& !bot.reparar()) {
                throw new Exception( "BOTA DER ROTA - NO PUEDE CORRER");                
            }
             if (bot1.getRoto()&& !bot1.reparar()) {
                throw new Exception( "BOTA IZQ ROTA - NO PUEDE CORRER");                
            }
            consumida = bot.getConsumo() * (bot.usar(2, temp) +bot1.usar(2, temp));
            bat.setCargaActual(bat.getCargaActual() - consumida);
             bot.setRoto(bot.seRompe());
             bot1.setRoto(bot1.seRompe());
        
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }

//   Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión. 
    public float propulsar(Armadura arm, int temp)throws Exception{
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Bota bot = arm.getBotaDer();
             Bota bot1 = arm.getBotaIzq();
             if (bot.getRoto()&& !bot.reparar()) {
                throw new Exception( "BOTA DER ROTA - NO PUEDE PROPULSAR");                
            }
             if (bot1.getRoto()&& !bot1.reparar()) {
                throw new Exception( "BOTA IZQ ROTA - NO PUEDE PROPULSAR");                
            }
            consumida = bot.getConsumo() * (bot.usar(3, temp) +bot1.usar(3, temp));
            bat.setCargaActual(bat.getCargaActual() - consumida);
            bot.setRoto(bot.seRompe());
             bot1.setRoto(bot1.seRompe());
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }
//   Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes. 

    public float volar(Armadura arm, int temp)throws Exception{
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Bota bot = arm.getBotaDer();
            Bota bot1 = arm.getBotaIzq();
            Guante gua = arm.getGuanteDer();
            Guante gua1 = arm.getGuanteIzq();
            if (bot.getRoto()&& !bot.reparar()) {
                throw new Exception( "BOTA DERECHA ROTA- NO PUEDE VOLAR");                
            }
            if (bot1.getRoto()&& !bot1.reparar()) {
                throw new Exception( "BOTA IZQUIEDA ROTA - NO PUEDE VOLAR");                
            }
            if (gua.getRoto()&& !gua.reparar()) {
                throw new Exception( "GUANTE DER ROTO - NO PUEDE VOLAR");                
            }
            if (gua1.getRoto()&& !gua1.reparar()) {
                throw new Exception( "GUANTE IZQ ROTO - NO PUEDE VOLAR");                
            }
            consumida = (bot.getConsumo() * (bot.usar(3, temp) +bot1.usar(3, temp))) + gua.getConsumo() * (gua.usar(2, temp) + gua1.usar(2, temp));
            bat.setCargaActual(bat.getCargaActual() - consumida);
            System.out.println("1"); 
            bot.setRoto(bot.seRompe());
            System.out.println("2");
             bot1.setRoto(bot1.seRompe());
             System.out.println("3");
            gua.setRoto(gua.seRompe());
            System.out.println("4");
            gua1.setRoto(gua1.seRompe());
            
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }
//   • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.

    public float disparoDer(Armadura arm, int temp) throws Exception{
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Guante gua = arm.getGuanteDer();            
            if (gua.getRoto()&& !gua.reparar()) {
                throw new Exception( "GUANTE DER ROTO - NO PUEDE VOLAR");                
            }
            consumida = gua.getConsumo() * gua.usar(3, temp);
            bat.setCargaActual(bat.getCargaActual() - consumida);
            gua.seRompe();
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }
    public float disparoIzq(Armadura arm, int temp) throws Exception{
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Guante gua = arm.getGuanteIzq();            
            if (gua.getRoto()&& !gua.reparar()) {
                throw new Exception( "GUANTE IZQ ROTO - NO PUEDE VOLAR");                
            }
            consumida = gua.getConsumo() * gua.usar(3, temp);
            bat.setCargaActual(bat.getCargaActual() - consumida);
            gua.seRompe();
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }
    }
//   Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico. 
//   

    public float usarConsola(Armadura arm, int temp) {
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Consola c = arm.getConsola();
            if (c.getRoto()&& !c.reparar()) {
                throw new Exception( "GUANTE ROTO - NO PUEDE VOLAR");                
            }
            consumida = c.getConsumo() * c.usar(1, temp);
            bat.setCargaActual(bat.getCargaActual() - consumida);
            c.seRompe();
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }

    }

    public float usarSintetizador(Armadura arm, int temp) {
        float consumida = 0;
        try {
            Generador bat = arm.getBateria();
            Sintetizador s = arm.getSint();
            if (s.getRoto()&& !s.reparar()) {
                throw new Exception( "GUANTE ROTO - NO PUEDE VOLAR");                
            }
            consumida = s.getConsumo() * s.usar(1, temp);
            bat.setCargaActual(bat.getCargaActual() - consumida);
            s.seRompe();
//        arm.setBateria(bat);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return consumida;
        }

    }

//  Mostrando Estado
//Hacer un método que JARVIS muestre el estado de todos los dispositivos y
    //toda la información de la Armadura. 
    public void mostrarEstado(Armadura arm) {
        System.out.println(arm);
    }
// Estado de la Batería
//Hacer un método para que JARVIS informe el estado de la batería en porcentaje a través de la
//consola. Poner como carga máxima del reactor el mayor float posible. Ejecutar varias acciones y
//mostrar el estado de la misma.  

    public int estadoBateria(Armadura arm) {
        Generador g = arm.getBateria();
        return (int) ((g.getCargaActual() / g.getCargaMax()) * 100);
    }
}
