package com.probanding.items.business.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Item {
    private final String id;
    private final String title;
    private final String thumbnail;
}
