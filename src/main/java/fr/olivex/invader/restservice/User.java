package fr.olivex.invader.restservice;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private List<Invader> invaders;
    public User(String name) {
        this.name = name;
    }
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
}
