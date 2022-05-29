package com.company;

import java.util.Scanner;

public class Java_07_DeletionAtEnd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array (n>1) : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Modified array after deleting last element is : ");
        for (int i = 0; i < n-1 ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
