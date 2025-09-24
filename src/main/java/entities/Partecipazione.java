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

    @Enumerated(EnumType.STRING)
    @Column(name = "Stato partecipazione")
    private StatoPartecipazione type;

}
