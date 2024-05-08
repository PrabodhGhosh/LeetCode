package org.learning.easy;

public class SingleNumber {

    //136. Single Number
    //Given a non-empty array of integers nums,
    // every element appears twice except for one. Find that single one.

    public int findSingleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            //XOR cancels out duplicate numbers and only keeps the one which
            // is not duplicate
            result = result^nums[i];
        }
        return result;
    }



    public static void main(String[] args) {

        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.findSingleNumber(new int[]{4,4,1,2,5,1,2}));

    }
}
