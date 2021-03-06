package com.ezra.arcade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private String initials;

    public Player() {

    }

    public Player(String username, String password, String initials) {
        this.username = username;
        this.password = password;
        this.initials = initials;
    }

    public Player(Integer id, String username, String password, String initials) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.initials = initials;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }
}
