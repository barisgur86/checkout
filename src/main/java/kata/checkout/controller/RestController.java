package kata.checkout.controller;

import org.springframework.web.bind.annotation.*;

import kata.checkout.service.CheckoutServices;

import java.math.BigDecimal;

import static kata.checkout.service.CheckoutServices.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/user")
    public String getUsers() {
        return "Hello World";
    }

    @PostMapping("/scan/{name}")
    private BigDecimal scan(@PathVariable ("name") String itemName) throws Exception {


        addCart(itemName);


        return calculateTotalAmount();

    }
}
