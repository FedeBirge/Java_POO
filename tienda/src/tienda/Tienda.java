package tienda;

import tienda.servicios.ProductoService;

/**
 *
 * @author feder
 */
public class Tienda {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        ProductoService serv = new ProductoService();
        serv.menu();
    }
    
}
