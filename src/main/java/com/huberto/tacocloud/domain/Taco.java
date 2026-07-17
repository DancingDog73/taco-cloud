package com.huberto.tacocloud.domain;

import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message = "Name must be at least 5 characters long")
    public String name;

    @NotNull
    @Size(min = 1, message = "Tacos must contain at least 1 ingredient")
    private List<Ingredient> ingredients;

}