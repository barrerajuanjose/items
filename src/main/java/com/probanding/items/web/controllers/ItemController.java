package com.probanding.items.web.controllers;

import com.probanding.items.business.services.ItemService;
import com.probanding.items.web.dtos.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/{id}")
    private Mono<ItemDto> get(@PathVariable(value = "id") String id) {
        return itemService.get(id)
                .map(item ->
                        ItemDto.builder()
                                .id(item.getId())
                                .title(item.getTitle())
                                .thumbnail(item.getThumbnail())
                                .shippingOptions("shipping options")
                                .build());
    }
}
