/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ServicePoliza {

    ArrayList<Poliza> polizas;
    private Scanner scan;
    ServiceCliente servCliente = new ServiceCliente();
    ServiceVehiculo servVehiculo = new ServiceVehiculo();
    ServiceCuota servCuo = new ServiceCuota();

    public ServicePoliza() {
        polizas = new ArrayList();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public Poliza crearPoliza() {
        Poliza pol = new Poliza();

        System.out.println("El numero de poliza se generará automaticamente..");
        presioneTecla();
        pol.setNumero((int) (Math.random() * 1000) + 1);
        System.out.print("Se generó el numero de poliza: ");
        System.out.println(pol.getNumero());
        pol.setFechaInicio(LocalDate.now());
        System.out.println("Ingrese el periodo de cobertura en meses\n(se tomará el mismo valor para la cantidad de cuotas a abonar)");
        pol.setCuotas(scan.nextInt());
        pol.setFechaFin(pol.getFechaInicio().plusMonths(pol.getCuotas()));
        pol.setPlan(servCuo.generarPlan(pol.getCuotas()));
        System.out.println("SE MUESTRA EL PLAN DE PAGOS");
        servCuo.mostrarPlan(pol.getPlan());
        System.out.println("Elija y escriba la forma de pago de las siguientes opciones:");
        System.out.println("( EFECTIVO - TRANSFERENCIA - CHEQUE - DEBITO - CREDITO )");
        pol.setFormaPago(scan.next());
        System.out.println("Elija y escriba el tipo de cobertura de las siguientes opciones:");
        System.out.println("( OBLIGATORIO - TERCEROS - TERCEROS COMPLETOS - PARCIAL - TOTAL )");
        pol.setTipoCobertura(scan.next());
        System.out.println("Defina el monto total asegurado para el vehiculo");
        pol.setMontoAsegurado(scan.nextLong());
        System.out.println("Indique por SI o por NO si tendrá cobertura contra granizo");
        System.out.print("Respuesta: ");
        String res = scan.next();
        if (res.equalsIgnoreCase("SI")) {
            pol.setGranizo(Boolean.TRUE);
            System.out.println("Indique el monto de cobertura por granizo");
            pol.setMontoGranizo(scan.nextInt());
        } else {
            pol.setGranizo(Boolean.FALSE);
        }
        System.out.println("");
        System.out.println("Se solicitarán los datos del cliente,\n primero se cheaquea si el mismo existe en nuestra base de datos");
        Cliente cliente = servCliente.buscarCliente();
        if (cliente == null) {
            cliente = servCliente.crearCliente();
        } else {
            System.out.println("Cliente existente - Se asocia a la poliza");
            presioneTecla();
        }
        pol.setCliente(cliente);
        System.out.println("");
        System.out.println("Se solicitarán los datos del vehiculo,\n primero se cheaquea si el mismo existe en nuestra base de datos");
        Vehiculo ve = servVehiculo.buscarVehiculo();
        if (ve == null) {
            ve = servVehiculo.crearVehiculo();
        } else {
            System.out.println("Vehiculo existente - Se asocia a la poliza");
            presioneTecla();
        }
        pol.setVehiculo(ve);
        System.out.println("");
        System.out.println("******* POLIZA CARGADA EXITOSAMENTE !!! *******");

        return pol;

    }

    public void modificarPoliza() {
        Poliza pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println("Se modifica la poliza " + pol.getNumero());
            presioneTecla();
            pol = crearPoliza();

        }
    }

    public void eliminarPoliza() {
        Poliza pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println("Se elimina la poliza " + pol.getNumero());
            presioneTecla();
            polizas.remove(pol);

        }
    }

    public Poliza buscarPoliza() {
        System.out.println("Ingrese el N° de poliza a buscar:");
        Integer n = scan.nextInt();
        for (Poliza poliza : polizas) {
            if (n.equals(poliza.getNumero())) {
                return poliza;
            }
        }

        return null;
    }

    public void mostrarPolizas() {
        for (Poliza poliza : polizas) {
            System.out.println("");
            System.out.println(poliza);
            System.out.println("-----------------------------------------");

        }

    }

    public void mostrarPoliza() {
        Poliza pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println(pol);

        }
    }

    public void menuPoliza() {
        System.out.println("-||||||- Gestion de Polizas -||||||-");
        System.out.println("");
        System.out.println("1. Crear Poliza");
        System.out.println("2. Modificar Poliza");
        System.out.println("3. Eliminar Poliza");
        System.out.println("4. Mostrar lista de Polizas");
        System.out.println("5. Mostrar Poliza especifica");
        System.out.println("6. Salir");
        System.out.println("");
        System.out.println("Ingrese una opción:");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                Poliza pol = crearPoliza();
                polizas.add(pol);
                presioneTecla();
                menuPoliza();
                break;
            case 2:
                modificarPoliza();
                presioneTecla();
                menuPoliza();
                break;
            case 3:
                eliminarPoliza();
                presioneTecla();
                menuPoliza();
                break;
            case 4:
                mostrarPolizas();
                presioneTecla();
                menuPoliza();
                break;
            case 5:
                mostrarPoliza();
                presioneTecla();
                menuPoliza();

                break;
            case 6:
                break;
            default:
                menuPoliza();
                break;
        }
    }

    public void menu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("----------*** La Tercera Seguros ***----------");
            System.out.println("");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Vehiculos");
            System.out.println("3. Gestion de Polizas");
            System.out.println("4. Gestion de Cuotas");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    servCliente.menuCliente();
                    break;
                case 2:
                    servVehiculo.menuVehiculo();
                    break;
                case 3:
                    menuPoliza();
                    break;
                case 4:
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    break;
            }
        }

    }

}
