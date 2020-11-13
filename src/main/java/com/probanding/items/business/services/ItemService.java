package com.probanding.items.business.services;

import com.probanding.items.business.models.Item;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ItemService {
    public Mono<Item> get(String id) {
        return Mono.just(Item.builder().id(id).title("un title").thumbnail("thumb").build());
    }
}
