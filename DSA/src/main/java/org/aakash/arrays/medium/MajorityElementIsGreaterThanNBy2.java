package org.aakash.arrays.medium;

public class MajorityElementIsGreaterThanNBy2 {
    public static void main(String[] args) {
        int[] a={1, 1, 1, 2, 1, 2};
        System.out.println(majorityElement(a));
    }
    public static  int majorityElement(int[] nums) {

        int elem=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                elem=nums[i];
            }else if(nums[i]==elem){
                count++;

            }
            else{
                count--;
            }
        }
        System.out.println(elem);
        int count1=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==elem){
                count1++;
            }
        }
        if(count1>nums.length/2){
            return elem;
        }

        return -1;
    }
}
