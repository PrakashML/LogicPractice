package com.day3.practice;


import java.util.Arrays;

public class FrequencyArray {

    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
