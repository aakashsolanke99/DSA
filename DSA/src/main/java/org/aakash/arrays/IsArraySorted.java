package org.aakash.arrays;

import java.util.ArrayList;
import java.util.List;

public class IsArraySorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(4);
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(ArrayList<Integer> nums) {

        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;

    }
}
