package libreria;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.LibreriaService;
import libreria.servicios.LibroService;

/**
 *
 * @author feder
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            LibreriaService serv = new LibreriaService();
            LibroService servL = new LibroService();
//            Editorial e1 = new Editorial(null, "LA EDITH");
//            Editorial e2 = new Editorial(null, "LA TOTA");
//            Editorial e3 = new Editorial(null, "EDITANOR");
//            Autor a1 =new Autor(null, "Pepito");
//            Autor a2 = new Autor(null, "Juana");
//            Autor a3 = new Autor(null, "EL chavo");
//            Libro l1 = new Libro(1L, "EL principito", 1999, 20, 0, 20, a1, e1);
//            Libro l2 = new Libro(2L, "EL ARO", 1990, 25, 0, 25, a2, e2);
//            Libro l3 = new Libro(3L, "EL principito", 2001, 10, 0, 10, a3, e3);
//            servL.guardarLibro(l1);
//            servL.guardarLibro(l2);
//            servL.guardarLibro(l3);
      
            serv.menu();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
