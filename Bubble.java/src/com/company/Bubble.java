package com.company;

public class Bubble {

    public static void main(String[] args) {

        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a,b,t;
        int size = 10;

        System.out.print("Array position by default: ");

        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b-1] > nums[b]) {

                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.print("Bubble array position: ");
        for (int i = 0; i < 10; i++)
        System.out.print(nums[i] + " ");
    }
}
