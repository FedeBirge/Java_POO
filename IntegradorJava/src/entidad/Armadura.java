/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author feder
 */
//En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
//información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
//Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
//de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
//prisioneros.
//Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
//encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
//guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
//La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
//se mide con un número entero cuya unidad de medida de dureza es Rockwell
//(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
//cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
//cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
//de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
//parte de la armadura.
//La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
//información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
//susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
//consola y sintetizador) tienen un consumo de energía asociado. 
public class Armadura {
    private String color1;
    private String color2;
    private String resistencia;
    private Bota botaDer;
    private Bota botaIzq;
    private Guante guanteDer;
    private Guante guanteIzq;
    private Consola consola;
    private Sintetizador sint;
    private Integer salud;
    private Generador bateria;

    public Armadura() {
    }

    public Armadura(String color1, String color2, String resistencia, Bota botaDer, Bota botaIzq, Guante guanteDer, Guante guanteIzq, Consola consola, Sintetizador sint, Integer salud, Generador bateria) {
        this.color1 = color1;
        this.color2 = color2;
        this.resistencia = resistencia;
        this.botaDer = botaDer;
        this.botaIzq = botaIzq;
        this.guanteDer = guanteDer;
        this.guanteIzq = guanteIzq;
        this.consola = consola;
        this.sint = sint;
        this.salud = salud;
        this.bateria = bateria;
    }
    

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSint() {
        return sint;
    }

    public void setSint(Sintetizador sint) {
        this.sint = sint;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Generador getBateria() {
        return bateria;
    }

    public void setBateria(Generador bateria) {
        this.bateria = bateria;
    }
    @Override
    public String toString() {
        return "<--Armadura-->"
                + "\nColor primario: "+ color1+ ", Color secundarioo: "+color2 + ", Tipo de resistencia: " + resistencia 
                + "\nBota Derecha: " + botaDer + ", Bota Izquierda: " + botaIzq 
                + "\nGuante Derecho: " + guanteDer + ", Guante Izquierdo: " + guanteIzq 
                + "\nConsola: " + consola + ", Sintetizador: "+ sint
                + "\nSalud: " + salud + ", Bateria: " + bateria  ;
    }
    
    
    
}
