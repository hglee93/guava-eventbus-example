package com.example.guava.eventbus.sevice;

import com.example.guava.eventbus.event.PaymentEvent;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private EventBus eventBus;

    @Autowired
    public PaymentService(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void paymentItem() {
        PaymentEvent paymentEvent = new PaymentEvent();
        eventBus.post(paymentEvent);
    }
}
