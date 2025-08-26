package org.aakash.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
//        System.out.println((-1)+(-1));
    }

    public static  int majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
//                System.out.println(map);
            }else{
                map.put(nums[i],1);
            }

        }
        System.out.println(map);

        int max=0;
        int need=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){

            if(e.getValue() > max){
                System.out.println(e.getKey());
                max = e.getValue();
                need=e.getKey();

            }

        }
        return max;

    }
    public static int pivotIndex(int[] nums) {
        int i=0;
        int j= nums.length-1;
        int  prevSum=nums[0];
        int lastSum=nums[nums.length-1];
        while(i<j){

            if(prevSum<lastSum){
                prevSum+=nums[i];
                i++;
            }else{
                lastSum+=nums[j];
                j--;
            }
            if(prevSum==lastSum){
                return i;
            }

        }
        return -1;
    }
}
