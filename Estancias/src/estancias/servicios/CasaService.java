/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDAO;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class CasaService {

    private Scanner scan;
    private CasaDAO dao;

    public CasaService() {
        scan = new Scanner(System.in).useDelimiter("\n");
        dao = new CasaDAO();

    }

    public Casa buscarCasaId(int id) throws Exception {
        try {

            Casa casa = dao.buscarCasaPorId(id);

            return casa;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Casa> listarCasasOp2() throws Exception {
        try {

            Collection<Casa> casas = dao.listarCasasDisponibleAgosto();

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Casa> listarCasas() throws Exception {
        try {

            Collection<Casa> casas = dao.listarCasas();
            for (Casa casa : casas) {
                System.out.println("Casa ID: " + casa.getId_casa() + " Ciudad " + casa.getCiudad() + " Pais " + casa.getPais()
                        + " Precio " + casa.getPrecio_habitacion() + " tipo: " + casa.getTipo_vivienda());

            }

            return casas;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirCasasOp2() throws Exception {

        try {
            //Listar porductos
            Collection<Casa> casas = listarCasasOp2();
            //Imprimimos los productos, todos los argumentos
            if (casas.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                for (Casa p : casas) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirCasasPais() throws Exception {

        try {
            //Listar porductos
            Map< String, Integer> casas = dao.listarCasasPais();
            //Imprimimos los productos, todos los argumentos
            if (casas.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                for (Map.Entry<String, Integer> entry : casas.entrySet()) {
                    Object key = entry.getKey();
                    Object val = entry.getValue();
                    System.out.println(key + " cantidad de casas: " + val);

                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirCasasLimpias() throws Exception {

        try {
            //Listar porductos
            Map< String, Casa> casas = dao.listarCasasLimpias();
            //Imprimimos los productos, todos los argumentos
            if (casas.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                for (Map.Entry<String, Casa> entry : casas.entrySet()) {
                    Object key = entry.getKey();
                    Object val = entry.getValue();
                    System.out.println(val + " " + key);

                }

            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarImprimirCasasOp7() throws Exception {
        try {

            Map<Casa, Float> mapa = dao.listarCasasAumento();

            if (mapa.isEmpty()) {
                System.out.println("No existen casas para imprimir");
            } else {
                for (Map.Entry<Casa, Float> entry : mapa.entrySet()) {
                    Casa key = entry.getKey();
                    Object val = entry.getValue();
                    System.out.println("Casa ID: " + key.getId_casa() + " Ciudad " + key.getCiudad() + " Pais " + key.getPais()
                            + " Precio " + key.getPrecio_habitacion() + " precio actualizado " + val);

                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarImprimirCasasOp4(LocalDate fecha, int tiempo) throws Exception {
        try {

            Collection<Casa> casas = dao.listarCasasDisponibleFechasOp4(fecha, tiempo);

            if (casas.isEmpty()) {
                System.out.println("No existen casas para imprimir");
            } else {
                for (Casa p : casas) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

}
