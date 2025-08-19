package org.isi.parametrages.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Relation 1..* avec Classes
    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL)
    private List<Classe> classes;

    // Getters et Setters
}
