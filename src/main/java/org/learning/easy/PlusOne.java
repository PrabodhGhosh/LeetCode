package org.learning.easy;

public class PlusOne {
    //66. Plus One
    //You are given a large integer represented as an integer array digits,
    // where each digits[i] is the ith digit of the integer.
    // The digits are ordered from most significant to least significant in left-to-right order.
    // The large integer does not contain any leading 0's.
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--)
        {
            //If digit[i] is less than 9, simply add 1 to the number and return the existing array
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            //When digit[i] ==9, set the element to 0
            digits[i]=0;
        }
        //if we never go inside if condition which means all the elements are 9, set all the elements to 0
        //create another array of current array size+1 and set the first element to 1
        //Finally return the new array.
        int[] arr  = new int[digits.length+1];
        arr[0]=1;
        return arr;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] arr = plusOne.plusOne(new int[]{1,2,3});
        for(int x: arr)
        {
            System.out.print(x);
        }

    }
}
