/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alumno;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServiceSimulador {
//  La clase Simulador debe tener un método que genere un listado de alumnos manera
//aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
//manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos  

    private Scanner scan;
    private ArrayList<String> nombres;
    private ArrayList<String> apellidos;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Long> dnis;
    private ArrayList<Voto> votos;

    public ServiceSimulador() {
        nombres = new ArrayList<>(Arrays.asList("Ana", "María", "Juana", "Pedro", "Jose", "Juan"));;
        apellidos = new ArrayList<>(Arrays.asList("Gomez", "Perez", "Suarez", "Olmos", "Lopez", "Sosa"));
        alumnos = new ArrayList<>();
        dnis = new ArrayList<>();
        scan = new Scanner(System.in).useDelimiter("\n");
        votos = new ArrayList<>();
    }

    public ArrayList<Alumno> generarAlumnos() {
        ArrayList<Alumno> alus = new ArrayList<>();
        System.out.println("Ingrese la cantidad de alumnos(Maximo 6 )");
        int cant = scan.nextInt();
        for (int i = 0; i < cant; i++) {
            Alumno al = new Alumno();
            int idNombre = (int) (Math.random() * 6);
            int idApellido = (int) (Math.random() * 6);
            al.setNombre(nombres.get(idNombre) + " " + apellidos.get(idApellido));
            alus.add(al);
        }
        generarDni(alus);
       
        return alus;
    }
//    Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
//rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
//debe retornar la lista de dnis.

    private void generarDni(ArrayList<Alumno> alus) {
        for (Alumno alu : alus) {
            int millo = (int) (Math.random() * 99);
            int cienmil = (int) (Math.random() * 99);
            int ciento = (int) (Math.random() * 99);
            alu.setDni((long) ((millo * 1000000) + (cienmil * 1000) + ciento));
            dnis.add(alu.getDni());

        }
    }

    public void mostrarAlumnos(ArrayList<Alumno> alum) {
        for (Alumno alumno : alum) {
            System.out.println(alumno);

        }
    }
public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }
//Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
//para cada alumno genera tres votos de manera aleatoria. En este método debemos
//guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
//votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
//Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
//mismo alumno. Utilizar un hashset para resolver esto
public void votacion(ArrayList<Alumno> alumnos){
       for (Alumno alumno : alumnos) {
           ArrayList<Alumno> votados = new ArrayList<>();
           int vot = 0;
           
           do {
               int ind =(int)(Math.random()*(alumnos.size()));
               if(!alumno.equals(alumnos.get(ind))){
                   if(!votados.contains(alumnos.get(ind))){
                       votados.add(alumnos.get(ind));
                       vot++;
                       alumnos.get(ind).setVotos(alumnos.get(ind).getVotos()+1);
                   }
               }
//               System.out.println(vot);
           } while (votados.size()<3);
           votos.add(new Voto(alumno, votados));
    }
}
 public void mostrarVotacion(){
     for (Voto voto : votos) {
         System.out.println(voto);
         
     }
 }      
 
    

    public void menu() {

        System.out.println("-------------IMULADOR DE VOTOS-------------");
        System.out.println("");
        System.out.println("1. Generar lista de Alumnos");
        System.out.println("2. Mostrar lista de Alumnos");
        System.out.println("3. Simular votos");
        System.out.println("4. Mostrar lista de votos");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion: ");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                alumnos = generarAlumnos();
                presioneTecla();    
                menu();
                break;
            case 2:
                mostrarAlumnos(alumnos);
                presioneTecla();    
                menu();
                break;
            case 3:
                votacion(alumnos);
                presioneTecla();    
                menu();
                break;
            case 4:
                mostrarVotacion();
                presioneTecla();    
                menu();
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion incorrecta!!");
                presioneTecla();    
                menu();
                break;

        }
    }
}
