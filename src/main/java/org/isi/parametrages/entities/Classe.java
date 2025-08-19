package org.isi.parametrages.entities;
import jakarta.persistence.*;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;
    private String description;

    // Relation avec Sector (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Sector getSector() { return sector; }
    public void setSector(Sector sector) { this.sector = sector; }
}

