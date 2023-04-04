package estancias.servicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class mainService {

    private Scanner scan;

    public mainService() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public void menu() throws Exception {
        try {
            FamiliaService servF = new FamiliaService();
            CasaService casaServ = new CasaService();
            System.out.println("<-------------------------> MENÚ ESTANCIAS <------------------------->");
            System.out.println("");
            System.out.println("1. Listar aquellas familias que tienen al menos 3 hijos y\n"
                    + "   con edad máxima inferior a 10 años.");
            System.out.println("2. Buscar y listar las casas disponibles para el periodo comprendido \n"
                    + "   entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.");
            System.out.println("3. Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.");
            System.out.println("4. Consulta la BD para que te devuelva aquellas casas disponibles \n"
                    + "   a partir de una fecha dada y un número de días específico");
            System.out.println("5. Listar los datos de todos los clientes que en algún momento \n"
                    + "   realizaron una estancia y la descripción de la casa donde la realizaron.");
            System.out.println("6. Listar todas las estancias que han sido reservadas por un cliente,\n"
                    + "   mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó.\n"
                    + "   La que reemplazaría a la anterior");
            System.out.println("7. Debido a la devaluación de la libra esterlina con respecto al euro\n"
                    + "   Se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido.\n"
                    + "   Mostar los precios actualizados.");
            System.out.println("8. Obtener el número de casas que existen para cada uno de los países diferentes");
            System.out.println("9. Busca y listar aquellas casas del Reino Unido\n"
                    + "   de las que se ha dicho de ellas(comentarios) que están ‘limpias’");
            System.out.println("10. Insertar nuevos datos en la tabla estancias\n"
                    + "    verificando la disponibilidad de las fechas");
            System.out.println("11. Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    servF.imprimirFamiliasOp1();
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    casaServ.imprimirCasasOp2();
                    presioneTecla();
                    menu();
                    break;
                case 3:
                    servF.imprimirFamiliasOp3();
                    presioneTecla();
                    menu();
                    break;
                case 4:
                    System.out.println("Ingrese una fecha con este fomato: AAAA-MM-DD");
                    String fecha = scan.next();
                    System.out.println("Ingrese cantidad de dias de estadia:");
                    int dias = scan.nextInt();
                    System.out.println(LocalDate.parse(fecha));
                    casaServ.listarImprimirCasasOp4(LocalDate.parse(fecha), dias);
                    presioneTecla();
                    menu();
                    break;
                case 5:

                    presioneTecla();
                    menu();
                    break;
                case 6:

                    presioneTecla();
                    menu();
                    break;
                case 7:

                    presioneTecla();
                    menu();
                    break;
                case 8:

                    presioneTecla();
                    menu();
                    break;
                case 9:
                    presioneTecla();
                    menu();
                    break;
                case 10:
                    presioneTecla();
                    menu();
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    presioneTecla();
                    menu();
                    break;
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
