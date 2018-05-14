package com.codewars.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class FindOddInt {

    public static void main(String[] args) {
        int[] array = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(array));
    }

    public static int findIt(int[] A) {
        Map<Integer, Integer> numbersMap = new HashMap();
        int oddNumber = 0;

        for (int i = 0; i < A.length; i++) {
            if (numbersMap.containsKey(A[i])) {
                int count = numbersMap.get(A[i]);
                numbersMap.put(A[i], count + 1);
            } else {
                numbersMap.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddNumber = entry.getKey();
                return oddNumber;
            }
        }
        return oddNumber;
    }
}
