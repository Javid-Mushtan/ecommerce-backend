package com.app.ecom.controller;

import com.app.ecom.dto.OrderResponse;
import com.app.ecom.service.OrderService;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class OrderController {

    private final OrderService orderService;

    public ResponseEntity<OrderResponse> createOrder(@RequestHeader("X-User-ID") String userId) {
        OrderResponse orderResponse = orderService.createOrder(userId);
         return new ResponseEntity<OrderResponse>(orderResponse, HttpStatus.CREATED)
    }
}
