package com.huberto.tacocloud.controllers;

import com.huberto.tacocloud.domain.Taco;
import com.huberto.tacocloud.repositories.TacoRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/tacos", produces = "application/json")
@CrossOrigin(origins = "http://tacocloud:8080")
public class TacoController {

    private TacoRepository repository;

    public TacoController(TacoRepository tacoRepository){
        this.repository = tacoRepository;
    }

    @GetMapping(params = "recent")
    public Iterable<Taco> recentTacos(){
        PageRequest page = PageRequest.of(
                0, 12, Sort.by("createdAt").descending());
        return repository.findAll(page).getContent();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(@PathVariable ("id") Long id){
        Optional<Taco> opTaco = repository.findById(id);
        if(opTaco.isPresent()){
            return ResponseEntity.ok(opTaco.get());
        }
        return  ResponseEntity.notFound().build();
    }


}