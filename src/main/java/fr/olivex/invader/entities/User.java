package fr.olivex.invader.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany
    private List<Invader> invaders;


    public User(String name) {
        this.name = name;
    }
    protected User() {}
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
    public List<Invader> getInvaders() {
        return invaders;
    }
    public void setInvaders(List<Invader> invaders) {
        this.invaders = invaders;
    }
    public String toString() {
        return String.format(
            "User #%d: %s (%d invaders flashed)",
            id, name, invaders.size()
        );
    }
}
