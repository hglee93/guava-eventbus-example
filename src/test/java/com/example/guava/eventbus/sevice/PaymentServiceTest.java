package com.example.guava.eventbus.sevice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentServiceTest {

    private PaymentService paymentService;

    @Autowired
    public PaymentServiceTest(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Test
    void 결재완료시_이벤트_확인() {
        paymentService.paymentItem();
    }

}