package com.vsk.practice.DataStructures.Stacks.Problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by : v1dya-sagar on 17-07-2024
 *
 * @author : v1dya-sagar
 * @date : 17-07-2024
 * @project : JavaPractice
 */
public class ImplementStackUsingQueues {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i=1; i<queue.size(); i++)
            queue.add(queue.remove());
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
