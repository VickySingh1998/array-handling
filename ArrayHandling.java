package com.bridgelabz;
public class ArrayHandling {
    public static void main(String[] args) {
        int [] arr = new int[] {34, 6, 98, 76, 86, 5, 39};
        int small = arr[0];

        for (int i : arr)
            if (i < small)
                small = i;
        System.out.println("The largest element in array is "+small);
    }
}
