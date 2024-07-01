package org.learning.easy;

public class ShuffleArray {
    //1470. Shuffle the Array
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int a =0;
        int i=0;
        int j = (nums.length/2);
        //Set 2 pointers to insert 2 elements in a new array called output
        //While increasing the pointers, we will increase the array size as well by 2 (a)
        while(i<=nums.length/2 && j <=nums.length-1)
        {
            output[a]=nums[i];
            output[a+1]=nums[j];
            i++;
            j++;
            a+=2;
        }
        return output;
    }

    public static void main(String[] args) {
        ShuffleArray sa = new ShuffleArray();
        int[] arr = sa.shuffle(new int[]{2,5,1,3,4,7},3);
        for(int x:arr)
        {
            System.out.print(x);
        }
    }
}
