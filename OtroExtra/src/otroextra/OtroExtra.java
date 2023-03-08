/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroextra;

/**
 *
 * @author feder
 */
public class OtroExtra {

    /**
     * @param args the command line arguments
     */
//    Un niño está está jugando a colorear su tablero de ajedrez y 
//    va a pintar cada casilla toda de azul o toda de rojo. 
//    Para darle un toque personalizado, quiere pintar 
//    la misma cantidad de casillas rojas que de azules, 
//    pero no quiere que le queden dos columnas con la misma cantidad de casillas rojas pintadas, 
//    ni quiere que le queden dos filas con la misma cantidad de casillas rojas pintadas.
//
//¿Puede logra¿Puede lograr pintarlo cumpliendo esas condiciones?
//
//¿Y si en vez de un tablero de ajedrez normal de 8x8 fuese un tablero de ajedrez gigante de 1000x1000?

    public static void main(String[] args) {
        String[][] tablero= new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j]="A";
                
            }
            
        }
        int cant=0;
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                if(j!=3){
                tablero[j][i]="R";
                cant++;
                }
            }
            
        }
     
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println(cant);
    }
    
}
