package ru.geekbrains;

public class PriorityQueue {

    public class QueueItem() {
        int priority;
        int value;
    }

    private int items;
    private int capacity;
    private QueueItem[] pqueue;
    private head = 0;
    

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        pqueue = new QueueItem[capacity];
        head = 0

    }
}
