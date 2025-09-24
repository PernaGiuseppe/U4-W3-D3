package entities;

import enums.EventType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "titolo", nullable = false, length = 10)
    private String titolo;
    @Column(name = "dataEvento", nullable = false)
    private LocalDate dataEvento;
    @Column(name = "descrizione", nullable = false, length = 50)
    private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo evento")
    private EventType type;
    @Column(name = "numero massimo", nullable = false, length = 3)
    private int numeroMax;

    public Evento() {
    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, EventType type, int numeroMax) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.type = type;
        this.numeroMax = numeroMax;
    }

    public Evento(String titolo, int anno, int mese, int giorno, String descrizione, EventType type, int numeroMax) {
        this(titolo, LocalDate.of(anno, mese, giorno), descrizione, type, numeroMax);
    }


    public UUID getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getNumeroMax() {
        return numeroMax;
    }

    public void setNumeroMax(int numeroMax) {
        this.numeroMax = numeroMax;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", type=" + type +
                '}';
    }
}
