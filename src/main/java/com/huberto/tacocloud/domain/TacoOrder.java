package com.huberto.tacocloud.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccVV;

    private List<Taco> tacos = new ArrayList<>();
    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}