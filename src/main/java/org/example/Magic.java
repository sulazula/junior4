package org.example;

import jakarta.persistence.*;

@Entity
@Table (name = "magic")
public class Magic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "damage")
    private int damage;

    @Column (name = "attack")
    private int attack;

    @Column (name = "armor")
    private int armor;

    public Magic(String name, int damage, int attack, int armor) {
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.armor = armor;
    }

    public Magic() {
        this.name = null;
        this.damage = 0;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
