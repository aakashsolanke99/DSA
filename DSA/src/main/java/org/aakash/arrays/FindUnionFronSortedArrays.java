package org.aakash.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindUnionFronSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5,6};
        System.out.println(unionArray(arr1,arr2));
    }

        public static  List<Integer> unionArray(int[] nums1, int[] nums2) {
            int n1=nums1.length;
            int n2= nums2.length;
            int i=0;
            int j=0;
            List<Integer> unionArrayList=new ArrayList<>();

            while(i<n1 && j<n2){
                if(nums1[i]<=nums1[j]){
                    if(unionArrayList.size() == 0 || unionArrayList.get(unionArrayList.size()-1)!=nums1[i]){
                        unionArrayList.add(nums1[i]);
                    }
                    i++;
                }else{
                    if(unionArrayList.size() ==0 || unionArrayList.get(unionArrayList.size()-1)!=nums2[j]){
                        unionArrayList.add(nums2[j]);

                    }
                    j++;
                }
            }

            while(j<n2){
                if(unionArrayList.size() ==0 || unionArrayList.get(unionArrayList.size()-1)!=nums2[j]){
                    unionArrayList.add(nums2[j]);

                }
                j++;
            }
            while(i<n1){
                if(unionArrayList.size() == 0 || unionArrayList.get(unionArrayList.size()-1)!=nums1[i]){
                    unionArrayList.add(nums1[i]);
                }
                i++;
            }
            return unionArrayList;
        }



}
