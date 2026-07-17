package com.huberto.tacocloud.repositories;


import com.huberto.tacocloud.domain.TacoOrder;
import java.util.Optional;

public interface OrderRepository{

    TacoOrder save(TacoOrder order);
}