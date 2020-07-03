package ru.geekbrains;

import java.util.NoSuchElementException;

public class StackHelper {

    private int capacity;
    private char[] stack;
    private int head;

    public StackHelper(int capacity) {
        this.capacity = capacity;
        this.stack = new char[capacity];
        this.head = -1;
    }

    public boolean isEmpty() {
        return this.head == -1;
    }

    public boolean isFull() {
        return this.head == this.capacity - 1;
    }

    public void push(char simbol) {
        if (isFull()) {
            capacity *= 2;
            char[] newStack = new char[capacity];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++head] = simbol;
    }

    public char pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        return stack[head--];
    }

    public char peek() {
        return stack[head];
    }
}
