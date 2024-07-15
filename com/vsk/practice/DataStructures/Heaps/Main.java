package com.vsk.practice.DataStructures.Heaps;

import java.util.ArrayList;

/**
 * created by : v1dya-sagar on 15-07-2024
 *
 * @author : v1dya-sagar
 * @date : 15-07-2024
 * @project : JavaPractice
 */


class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}
