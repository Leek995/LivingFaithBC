package com.example.livingfaithbc.models;

import jakarta.persistence.*;

@Entity
@Table(name = "new member registration")
public class NewMemberRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, length = 25)
    private String firstname;

    @Column(nullable = false, length = 25)
    private String lastname;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 15)
    private long phone_number;

}
