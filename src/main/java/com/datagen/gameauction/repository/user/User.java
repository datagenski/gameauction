package com.datagen.gameauction.repository.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String name;

    private String lastname;

    private String middleName;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String description;

    private String phoneNumber;
}
