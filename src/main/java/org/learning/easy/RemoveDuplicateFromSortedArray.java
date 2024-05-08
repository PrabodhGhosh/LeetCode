package org.learning.easy;

//26. Remove Duplicates from Sorted Array
/*Consider the number of unique elements of nums to be k,
to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements
in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.*/

public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] arr)
    {
        int index = 1;
        //Setting the counter, which will be increased
        // everytime there is a mismatch between i+1 & i th value.
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                //Put the arr[i] to arr[index] to ensure all the unique elements come first
                arr[index]=arr[i];
                index++;
            }

        }
        return index;
    }

    public static void main(String[] args) {

        RemoveDuplicateFromSortedArray removeDuplicates = new RemoveDuplicateFromSortedArray();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,4,5,6,6}));

    }
}
