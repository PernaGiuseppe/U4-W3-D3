package entities;

import enums.SessoType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "Id persona")
    private UUID personId;
    @Column(name = "Nome", nullable = false, length = 10)
    private String nome;
    @Column(name = "Cognome", nullable = false, length = 10)
    private String cognome;
    @Column(name = "Email", nullable = false, length = 10)
    private String email;
    @Column(name = "Data di Nascita", nullable = false)
    private LocalDate dataNascita;
    @Enumerated(EnumType.STRING)
    @Column(name = "Sesso")
    private SessoType type;
    @Column(name = "Lista Partecipazioni", nullable = false, length = 3)
    private int listaPartecipazioni;

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, SessoType type, int listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.type = type;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public Persona(String nome, String cognome, String email, int anno, int mese, int giorno, SessoType type, int listaPartecipazioni) {
        this(nome, cognome, email, LocalDate.of(anno, mese, giorno), type, listaPartecipazioni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return personId;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public SessoType getType() {
        return type;
    }

    public void setType(SessoType type) {
        this.type = type;
    }

    public int getListaPartecipanti() {
        return listaPartecipazioni;
    }

    public void setListaPartecipanti(int listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }
}