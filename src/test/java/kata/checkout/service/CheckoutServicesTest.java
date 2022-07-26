package kata.checkout.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckoutServicesTest {

    @Test
    public void shouldAdd() {
        String name = "A";

        CheckoutServices.addCart(name);

        assertTrue(CheckoutServices.cartMap.containsKey(name));
    }
}
