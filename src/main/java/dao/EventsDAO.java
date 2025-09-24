package dao;

import entities.Evento;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventsDAO {
    private final EntityManager entityManager;

    public EventsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento newEvento) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvento);
        transaction.commit();
        System.out.println("L'evento " + newEvento.getTitolo() + " è stato salvato");
    }

    public Evento findID(long eventID) {
        Evento found = entityManager.find(Evento.class, eventID);
        if (found == null) throw new NotFoundException(eventID);
        return found;
    }

    public void findAndDeleteID(long eventID) {
        Evento found = this.findID(eventID);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(found);
        transaction.commit();
        System.out.println("L'evento " + found.getTitolo() + " è stato rimosso correttamente!");
    }
}
