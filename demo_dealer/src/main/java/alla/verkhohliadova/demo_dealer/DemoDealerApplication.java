package alla.verkhohliadova.demo_dealer;

import alla.verkhohliadova.demo_dealer.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public class DemoDealerApplication {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("blablabla");
        EntityManager em = factory.createEntityManager();

        /*Car car = new Car(5L, "Audi a8", 20000L, 3.0, true);
        em.getTransaction().begin();
        em.persist(car);

        em.getTransaction().commit();*/



        em.close();
        factory.close();
    }
}
