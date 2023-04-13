package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author feder
 * @param <T>
 */
public class DAO<T> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("libreriaPU");
    protected EntityManager em = EMF.createEntityManager();

    protected void conectar() {
        try {
            if (!em.isOpen()) {
                em = EMF.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("Eror al conectar --> " + e.getMessage());
        }

    }

    protected void desconectar() {
        try {
            if (em.isOpen()) {
                em.close();
            }
        } catch (Exception e) {
            System.out.println("Eror al desconectar --> " + e.getMessage());
        }

    }

    protected void guardar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ereor al guardarDAO --> " + e.getMessage());
        } finally {
            desconectar();
        }

    }

    protected void editar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al editar --> " + e.getMessage());
        } finally {
            desconectar();
        }

    }

    protected void eliminar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();           
            em.remove( em.merge(objeto));
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al elimiar --> " + e.getMessage());
        } finally {
            desconectar();
        }

    }

}
