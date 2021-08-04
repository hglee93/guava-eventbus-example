package com.example.guava.eventbus.sevice;

import com.example.guava.eventbus.event.PaymentEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushService {

    private EventBus eventBus;

    @Autowired
    public PushService(EventBus eventBus) {
        this.eventBus = eventBus;
        this.eventBus.register(this);
    }

    @Subscribe
    public void sendPushToCustomer(PaymentEvent paymentEvent){
        System.out.println("Received PaymentEvent");
        System.out.println("Send push to customer");
    }
}
