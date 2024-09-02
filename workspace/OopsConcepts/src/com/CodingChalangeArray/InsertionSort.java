package com.CodingChalangeArray;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){

        // Grt Data From User 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Of element for Array :");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element one by one :");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        // InserSorting Process
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        // Print After Sorting
        System.err.println("After Sorting Array :");
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
