package com.example.demospring.entity;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter

@NoArgsConstructor
//@Component
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String email;

    private String address;


    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

}
