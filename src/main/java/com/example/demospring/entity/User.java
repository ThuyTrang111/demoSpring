package com.example.demospring.entity;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String email;

    private String address;


}
