package com.wp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String username;

    private String password;

    public User( Integer id, String username, String password ) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User( String username, String password ) {
        this.username = username;
        this.password = password;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId( Integer id ) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername( String username ) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword( String password ) {
        this.password = password;
    }
}