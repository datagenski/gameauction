package com.datagen.gameauction.repository.gameregister.entity;

import com.datagen.gameauction.repository.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class RegisteredGame {

    @Id
    private Long id;

    private String name;

    private String gameImageUrl;

    private BigDecimal price;

    private String currency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
