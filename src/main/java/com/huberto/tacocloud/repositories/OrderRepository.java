package com.huberto.tacocloud.repositories;


import com.huberto.tacocloud.domain.Ingredient;
import com.huberto.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}