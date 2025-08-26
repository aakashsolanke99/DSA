package org.aakash.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, -7, 6, -3};
        System.out.println(Arrays.toString(twoSum(arr,0)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum= target-nums[i];
            if(map.containsKey(sum)){
                return new int[]{map.get(sum),i};
            }else{
                map.put(nums[i],i);
            }

        }
        return new int[]{};

    }
}
