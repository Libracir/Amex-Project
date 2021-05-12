package com.jackstarrs.amexproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class pageController {

    @GetMapping("/order")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order";
    }

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    public String orderSubmit(@ModelAttribute Order order, Model model, Order users) {
        model.addAttribute("order", order);
        orderRepository.save(users);
        return "result";
    }
}

