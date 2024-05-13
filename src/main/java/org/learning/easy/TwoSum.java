package org.learning.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //1. Two Sum
    //Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    public int[] twoSum(int[] nums, int target) {

        //Create an array of size 2 to store the indices
        int[] arr = new int[2];
        //Create a map
        Map<Integer,Integer> hashmap = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            //Create a variable to store the difference
            int difference = target-nums[i];
            if(hashmap.containsKey(difference))
            //If the difference exists in the map, store the indices of
            //current number and difference
            {
                arr[0]=i;
                arr[1]=hashmap.get(difference);
                break;

            }
            //If the difference does not exists, store the element in the map
            hashmap.put(nums[i],i);
        }
        return arr;

    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(new int[]{1,2,3,4,5,6,7,8,9}, 7);
        for (int x: arr)
        {
            System.out.print(x+" ");
        }

    }
}
