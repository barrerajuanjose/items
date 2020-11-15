package com.probanding.items.business.services.flux;

import com.probanding.items.business.models.PaymentOptions;
import com.probanding.items.business.services.PaymentOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import rx.RxReactiveStreams;

@Component
public class PaymentOptionsFluxService {

    @Autowired
    private PaymentOptionsService paymentOptionsService;

    public Mono<PaymentOptions> get(String itemId) {
        return Mono.fromDirect(RxReactiveStreams.toPublisher(paymentOptionsService.getPaymentOptions(itemId)));
    }
}
