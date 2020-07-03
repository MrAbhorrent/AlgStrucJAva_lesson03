package ru.geekbrains;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.NoSuchElementException;

public class Deque {

    private int capacity;
    private int[] deque;
    private int headtop;
    private int headbottom;
    private int items;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        headtop = 0;
        headbottom = -1;
        items = 0;
    }

    public boolean isEmpty() {
        return items == 0;
    }

    public boolean isFull() {
        return items == capacity;
    }

    public int size() {
        return items;
    }

    private void increaseCapacity() {
        capacity *= 2;
        int[] newQ = new int[capacity];
        if (headbottom >= headtop) {
            System.arraycopy(deque, 0, newQ, 0, deque.length);
        } else {
            System.arraycopy(deque, 0, newQ, 0, headbottom + 1);
            System.arraycopy(deque, headtop,
                    newQ, capacity - (deque.length - headtop),
                    deque.length - headtop - 1);
        }
        deque = newQ;
    }

    public void insertBottom(int value) {
        if (isFull()) increaseCapacity();
        if (headbottom == capacity - 1)
            headbottom = -1;
        deque[++headbottom] = value;
        items++;
    }

    public void insertTop(int value) {
        if (isFull()) increaseCapacity();
        if (headtop == 0)
            headtop = capacity - 1;
        deque[--headtop] = value;
        items++;
    }

    public int removeTop() {
        if (isEmpty())
            throw new NoSuchElementException("Deque is epmty");
        int temp = deque[headtop++];
        if (headtop == capacity)
            headtop = 0;
        items--;
        return temp;
    }

    public int removeBottom() {
        if (isEmpty())
            throw new NoSuchElementException("Deque is epmty");
        int temp = deque[headbottom--];
        if (headbottom == -1)
            headbottom = capacity;
        items--;
        return temp;
    }

    public int peekTop() {
        return deque[headtop];
    }

    public int peekBottom() {
        return deque[headbottom];
    }
}
