package com.bridgelabz;
public class ArrayHandling {
    public static void main(String[] args) {
        int [] arr = new int[] {34, 6, 98, 76, 86, 5};
        System.out.println("The elements of an array present on odd position :- ");

        for (int i=0; i<arr.length; i=i+2)
        System.out.println(arr[i]);
    }
}
