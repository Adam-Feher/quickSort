package com.adam;

import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> randomList) {
        quickSort(randomList, 0, randomList.size() - 1);
        return randomList;
        }

    private void quickSort(List<Integer> randomList, int low, int high) {
        if (low < high) {
            int partitionIndex = partitionList(randomList, low, high);

            quickSort(randomList, low, partitionIndex-1);
            quickSort(randomList, partitionIndex+1, high);
        }
    }

    private static int partitionList(List<Integer> randomList, int low, int high) {
        int pivot = randomList.get(high);
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (randomList.get(j) <= pivot) {
                i++;
                swap(randomList, i, j);
            }
        }
        swap(randomList,i+1,high);
        return (i+1);
    }

    private static void swap(List<Integer> randomList, int i, int j) {
        int temp = randomList.get(i);
        randomList.set(i,randomList.get(j));
        randomList.set(j, temp);
    }
}
