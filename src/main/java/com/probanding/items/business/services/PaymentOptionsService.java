package com.probanding.items.business.services;

import com.probanding.items.business.models.PaymentOptions;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.stereotype.Component;
import rx.Observable;

import java.util.List;

@Component
public class PaymentOptionsService {

    public Observable<PaymentOptions> getPaymentOptions(String itemId) {
        PaymentOptions.PaymentMethod paymentMethod = PaymentOptions.PaymentMethod.builder().id("pepe").build();

        return Observable.just(PaymentOptions.builder().paymentMethods(List.of(paymentMethod)).build());
    }

}
