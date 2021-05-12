package com.jackstarrs.amexproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.*;


import javax.swing.text.html.Option;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public Iterable<Order> findAllUsers() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findUserById(@PathVariable(value = "id") long id) {
        Optional<Order> user = orderRepository.findById(id);

        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public Order saveOrder(@Validated @RequestBody Order users) {
        return orderRepository.save(users);
    }
}
