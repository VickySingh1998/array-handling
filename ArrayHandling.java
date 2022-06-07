package com.bridgelabz;
public class ArrayHandling {
    public static void main(String[] args) {
        int [] arr = new int[] {34, 6, 98, 76, 86, 5, 39};
        int large = arr[0];

        for (int i : arr)
            if (i > large)
                large = i;
        System.out.println("The largest element in array is "+large);
    }
}
