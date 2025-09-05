package com.RLTSM1.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "User")

public class User {
    @id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private boolean enabled;
    private String imageUrl;
    @Column(length = 500)
    private String about;

}
