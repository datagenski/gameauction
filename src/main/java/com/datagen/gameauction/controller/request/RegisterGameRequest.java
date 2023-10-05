package com.datagen.gameauction.controller.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegisterGameRequest {

    @NotBlank
    private String name;

    @NotBlank

    private BigDecimal price;

    @Pattern(regexp = "[A-Za-z0-9]+")
    private String currency;

}
