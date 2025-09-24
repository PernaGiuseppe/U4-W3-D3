import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        /*   EventsDAO ed = new EventsDAO((em));*/
    /*    Evento event1 = new Evento("matrimonio", 2025, 10, 5, "unione fra due persone", EventType.PRIVATO, 250);
        Evento event2 = new Evento("concerto", 2022, 8, 1, "musica ad alto volume in piazza", EventType.PUBBLICO, 800);
        Evento event3 = new Evento("sagra", 2023, 6, 30, "sagra della castagna", EventType.PUBBLICO, 900);
        Evento event4 = new Evento("laurea", 2024, 11, 8, "conseguimento titolo di studio", EventType.PRIVATO, 150);
        ed.save(event1);
        ed.save(event2);
        ed.save(event3);
        ed.save(event4);*/
     /*   try {
            Evento eventoID = ed.findID(2);
            System.out.println(eventoID + " trovato");
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ed.findAndDeleteID(5);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }*/
        em.close();
        emf.close();
    }
}
