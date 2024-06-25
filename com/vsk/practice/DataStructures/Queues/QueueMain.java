package com.vsk.practice.DataStructures.Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(100);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(200);
        queue.display();

    }
}
