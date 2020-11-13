package com.probanding.items.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/items")
public class ItemController {

    @GetMapping("/{id}")
    private Mono<String> get(@PathVariable(value = "id") String id) {
        return Mono.just(id);
    }
}
