package entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "events")
public class Location {
    @Id
    @GeneratedValue
    @Column(name = "Id location")
    private UUID locationId;
    @Column(name = "Nome location")
    private String nomeLocation;
    @Column(name = "Città", nullable = false, length = 10)
    private String citta;

    public UUID getLocationId() {
        return locationId;
    }

    public String getNomeLocation() {
        return nomeLocation;
    }

    public void setNomeLocation(String nomeLocation) {
        this.nomeLocation = nomeLocation;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
