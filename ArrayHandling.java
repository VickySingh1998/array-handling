package com.bridgelabz;
public class ArrayHandling {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 2, 4, 5, 5, 6};
        int [] frequency = new int [arr.length];
        int v = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;

                    frequency[j] = v;
                }
            }
            if(frequency[i] != v)
                frequency[i] = count;
        }
        System.out.println(" Element | Frequency");
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != v)
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
        }
        System.out.println("----------------------------------------");
    }
}
