package com.CodingChalangeArray;

import java.util.Scanner;

public class InsertElement {
    public static void main(String args[]){

        // Get Data From User 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Of element for Array :");
        int n = scan.nextInt();

        System.out.println("Enter the element One by One");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        // Get Insert Element From User
        System.out.println("Enter The Insert Element :");
        int insert_element = scan.nextInt();

        // Get Insert Index From User
        System.out.println("Enter The Index :");
        int index = scan.nextInt();

        
        int[] after_insert_arr = insertProcerss(arr,insert_element,index);
        
        // Print After insert element Array
        System.out.println("After Insert Element on Array Values Are :");
        for(int remElements: after_insert_arr){
            System.out.println(remElements);
        } 
        scan.close();
        
    }

    private static int[] insertProcerss(int[] arr,int insertElement, int index){
        // Create a new Array with one more element than the original arr
        int[] newArray = new int[arr.length + 1];

        // Copy elements before the specified index
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new element at the specified index
        newArray[index] = insertElement;

        // Copy the remaining elements after the specified index
        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}
