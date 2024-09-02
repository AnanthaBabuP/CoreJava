package com.CodingChalangeArray;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Get User Input for First Array Element
        System.out.println("Enter the count of first Element :");
        int n1 = scan.nextInt();
        System.out.println("Enter the First Array Element one by one :");
        
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]= scan.nextInt();
        }

        // Get User Input for Second Array Element
        System.out.println("Enter the count of second Array Element :");
        int n2 = scan.nextInt();
        System.out.println("Enter the First Array Element one by one :");
        
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]= scan.nextInt();
        }

        // Merge Process
        int[] mergeArray = mergeArray(arr1,arr2);
        // Print on Merge Array Element
        System.out.println("After Merge Array");
        for(int i=0;i<mergeArray.length;i++){
            System.out.println(mergeArray[i]);
        }
        scan.close();
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int totalLength = arr1.length+arr2.length;
        
        int[] mergeArray = new int[totalLength];

        for(int i=0;i<arr1.length;i++){
            mergeArray[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            mergeArray[arr1.length+j] = arr2[j]; 
        }
        
        return mergeArray;
    }
    
}
