package com.adam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(50));
        }
        long startTime = System.currentTimeMillis();
        List<Integer> sortedRandomList = quickSort.sort(randomList);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

}
