package org.learning.easy;

import java.util.*;

public class ContainsDuplicate {
     //217. Contains Duplicate
    //Given an integer array nums, return true if any value appears at least twice in the array,
    // and return false if every element is distinct.
    //[1,2,3,1]

    public boolean containsDuplicate(int[] nums) {

            Set<Integer> hashset = new HashSet<>();
            for(int num: nums)
            {
                if(hashset.contains(num))
                    return true;
                hashset.add(num);
            }
            return false;

    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean b = containsDuplicate.containsDuplicate(new int[]{1,2,3,1});
        System.out.println(b);

    }

}
