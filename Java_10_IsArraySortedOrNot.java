package com.company;

import java.util.Scanner;

public class Java_10_IsArraySortedOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n-1 ; i++)
        {
            if(a[i+1] < a[i]) {
                k = 1;
                System.out.println("Array is not sorted");
                break;
            }
        }
        if(k == 0)
            System.out.println("Array is sorted");
    }
}
