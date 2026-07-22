package com.huberto.tacocloud.repositories;


import com.huberto.tacocloud.domain.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}