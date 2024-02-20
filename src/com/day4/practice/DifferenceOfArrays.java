package com.day4.practice;

import java.util.*;
import java.util.Set;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int[] nums2 = {5,7,2};
        DifferenceOfArrays d = new DifferenceOfArrays();
        List<List<Integer>> list = d.findDifference(nums1,nums2);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for(int num : set1) {
            if(!set2.contains(num)) {
                result.get(0).add(num);
            }
        }
        for(int num : set2) {
            if(!set1.contains(num)) {
                result.get(1).add(num);
            }
        }
        return result;

    }
}
