package org.learning.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //349. Intersection of Two Arrays
    //Given two integer arrays nums1 and nums2, return an array of their
    //intersection
    //. Each element in the result must be unique and you may return the result in any order.

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int n : nums1) {
            s1.add(n);
        }

        Set<Integer> s2 = new HashSet<>();
        for (int n : nums2) {
            s2.add(n);
        }

        s1.retainAll(s2);

        int[] arr = new int[s1.size()];
        int i = 0;
        for (int x : s1) {
            arr[i] = x;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays is = new IntersectionOfTwoArrays();
        int[] arr1 = new int[]{4, 9, 5};
        int[] arr2 = new int[]{9, 4, 9, 8, 4};
        int[] arr = is.intersection(arr1, arr2);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
