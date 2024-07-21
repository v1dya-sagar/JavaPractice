package com.vsk.practice.DataStructures.TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * created by : v1dya-sagar on 21-07-2024
 *
 * @author : v1dya-sagar
 * @date : 21-07-2024
 * @project : JavaPractice
 */
public class FruitsIntoBaskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int res = 0, i = 0;
        for (int j = 0; j < tree.length; ++j) {
            count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
            while (count.size() > 2) {
                count.put(tree[i], count.get(tree[i]) - 1);
                if (count.get(tree[i]) == 0) count.remove(tree[i]);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
