package org.example;

public class DishStack {
    private Dish[] dishes;
    private int currentSize;

    public DishStack() {
        dishes = new Dish[10];
        currentSize = 0;
    }

    public DishStack(int maximumSize) {
        dishes = new Dish[maximumSize];
        currentSize = 0;
    }

    public void push(Dish dish) {
        if (currentSize == dishes.length) {
            System.out.println("The stack is full.");
            return;
        }

        dishes[currentSize] = dish;
        currentSize++;
    }

    public Dish pop() {
        if (currentSize == 0) {
            System.out.println("The stack is empty.");
            return null;
        }

        currentSize--;
        Dish topDish = dishes[currentSize];
        dishes[currentSize] = null;

        return topDish;
    }

    public Dish peek() {
        if (currentSize == 0) {
            System.out.println("The stack is empty.");
            return null;
        }

        return dishes[currentSize - 1];
    }

    public int size() {
        return currentSize;
    }
}
