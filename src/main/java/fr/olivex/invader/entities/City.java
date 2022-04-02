package fr.olivex.invader.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String prefix;

    @OneToMany
    private List<Invader> invaders;

    public City(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }
    protected City() {}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public List<Invader> getInvaders() {
        return invaders;
    }
    public void setInvaders(List<Invader> invaders) {
        this.invaders = invaders;
    }
    public String toString() {
        return String.format(
            "City #%d: %s (prefix: %s)",
            id, name, prefix
        );
    }
}
