package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DishStackTest {

    @Test
    void testNewStackStartsEmpty() {
        DishStack stack = new DishStack();

        assertEquals(0, stack.size());
    }

    @Test
    void testPushAddsDish() {
        DishStack stack = new DishStack();
        Dish dish = new Dish("A blue dish");

        stack.push(dish);

        assertEquals(1, stack.size());
    }

    @Test
    void testPeekReturnsTopDishWithoutRemovingIt() {
        DishStack stack = new DishStack();
        Dish firstDish = new Dish("First dish");
        Dish secondDish = new Dish("Second dish");

        stack.push(firstDish);
        stack.push(secondDish);

        Dish result = stack.peek();

        assertSame(secondDish, result);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopReturnsMostRecentDish() {
        DishStack stack = new DishStack();
        Dish firstDish = new Dish("First dish");
        Dish secondDish = new Dish("Second dish");

        stack.push(firstDish);
        stack.push(secondDish);

        Dish result = stack.pop();

        assertSame(secondDish, result);
        assertEquals(1, stack.size());
    }

    @Test
    void testPushWhenStackIsFullDoesNotChangeStack() {
        DishStack stack = new DishStack(2);
        Dish firstDish = new Dish("First dish");
        Dish secondDish = new Dish("Second dish");
        Dish thirdDish = new Dish("Third dish");

        stack.push(firstDish);
        stack.push(secondDish);
        stack.push(thirdDish);

        assertEquals(2, stack.size());
        assertSame(secondDish, stack.peek());
    }

    @Test
    void testPeekOnEmptyStackReturnsNull() {
        DishStack stack = new DishStack();

        assertNull(stack.peek());
    }

    @Test
    void testPopOnEmptyStackReturnsNull() {
        DishStack stack = new DishStack();

        assertNull(stack.pop());
    }
}
