package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DishTest {

    @Test
    void testDishStoresDescription() {
        Dish dish = new Dish("A blue dish");

        assertEquals("A blue dish", dish.description);
    }
}
