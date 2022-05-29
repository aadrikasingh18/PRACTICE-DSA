package com.company;

import java.util.Scanner;

public class Java_08_DeletionAtParticularIndex {
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
        System.out.print("Enter the index which has to be deleted : ");
        int in = sc.nextInt();
        int[] b = new int[n-1];
        for (int i = 0; i < in ; i++)
        {
            b[i] = a[i];
        }
        for (int i = in; i < n-1 ; i++)
        {
            b[i] = a[i+1];
        }
        System.out.print("Modified array after deleting element is : ");
        for (int i = 0; i < n-1 ; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
