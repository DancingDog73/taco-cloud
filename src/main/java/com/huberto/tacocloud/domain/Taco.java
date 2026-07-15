package com.huberto.tacocloud.domain;

import lombok.*;

import java.util.List;

@Data
public class Taco {

    public String name;
    private List<Ingredient> ingredients;

}