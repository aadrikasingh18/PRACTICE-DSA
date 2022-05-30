package com.company;

import java.util.Scanner;

public class Java_14_LeftRotateBy1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array : ");
        int[] a = new int[n];
        for (int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        temp = a[0];
        for (int i = 1; i < n; i++)
        {
            a[i-1] = a[i];
        }
        a[n-1] = temp;
        System.out.print("Array after Left rotating by 1 is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
