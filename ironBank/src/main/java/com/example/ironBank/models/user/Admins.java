package com.example.ironBank.models.user;

import com.example.ironBank.models.user.User;
import jakarta.persistence.*;

@Entity
public class Admins extends User {

    public Admins() {
    }

    public Admins(String name) {
        super(name);
    }
}