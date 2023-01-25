package com.example.livingfaithbc.models;

import jakarta.persistence.*;

@Entity
@Table(name = "email subscription")
public class EmailSubscription {

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

    public EmailSubscription() {
    }

    public EmailSubscription(long id, String firstname, String lastname, String email, long phone_number) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone_number = phone_number;
    }
}
