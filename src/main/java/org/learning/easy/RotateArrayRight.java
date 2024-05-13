package org.learning.easy;

public class RotateArrayRight {
//189. Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    public void rotate(int[] nums, int k) {

        //We are doing mod because if k>=nums.length, we can avoid unnecessary iteration
        k = k % nums.length;
        //reverse whole array
        reverse(nums, 0, nums.length - 1);
        //reverse upto k-1 position
        reverse(nums, 0, k - 1);
        //reverse reamining array
        reverse(nums, k, nums.length - 1);
    }

    //Reverse function to reverse the elements
    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    //Swap function to swap the values
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        RotateArrayRight s = new RotateArrayRight();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        s.rotate(arr, 3);
        for (int s1 : arr) {
            System.out.print(s1);
        }


    }
}
