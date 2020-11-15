package com.probanding.items.business.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PaymentOptions {
    private final List<PaymentMethod> paymentMethods;

    @Getter
    @Builder
    public static class PaymentMethod {
        private final String id;
        private final String name;
        private final Issuer issuer;
        private final List<String> labels;
    }

    @Getter
    @Builder
    private static class Issuer {
        private final String id;
        private final String name;
        @JsonAlias("default")
        private final boolean _default;
    }
}
