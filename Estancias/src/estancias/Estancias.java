package estancias;

import estancias.servicios.mainService;

/**
 *
 * @author feder
 */
public class Estancias {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        mainService serv = new mainService();
      serv.menu();

    }
    
}
