package com.huberto.tacocloud.web;


import com.huberto.tacocloud.domain.Ingredient;
import com.huberto.tacocloud.domain.Ingredient.Type;
import com.huberto.tacocloud.repositories.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository repo;


    public IngredientByIdConverter(IngredientRepository repo){
       this.repo = repo;
    }

    @Override
    public Ingredient convert(String id){
        return repo.findById(id).orElse(null);
    }

}
