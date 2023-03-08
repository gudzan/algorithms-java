package org.example;

import leetcode.easy.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int[] {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(BinarySearch.search(nums,target));
    }
}