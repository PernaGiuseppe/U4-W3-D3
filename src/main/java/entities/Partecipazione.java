package entities;

import enums.StatoPartecipazione;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "events")
public class Partecipazione {
    @Id
    @GeneratedValue
    @Column(name = "Id partecipazione")
    private UUID presenceId;
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;
    @Enumerated(EnumType.STRING)
    @Column(name = "Stato partecipazione")
    private StatoPartecipazione type;

    public Partecipazione() {
    }

    public Partecipazione(Persona persona, Evento evento, StatoPartecipazione type) {
        this.persona = persona;
        this.evento = evento;
        this.type = type;
    }

    public UUID getPresenceId() {
        return presenceId;
    }

    public StatoPartecipazione getType() {
        return type;
    }

    public void setType(StatoPartecipazione type) {
        this.type = type;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "presenceId=" + presenceId +
                ", persona=" + persona +
                ", evento=" + evento +
                ", type=" + type +
                '}';
    }
}
